package com.example.crudSpringBoot.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudSpringBoot.exception.ResourceNotFoundException;
import com.example.crudSpringBoot.model.Note;
import com.example.crudSpringBoot.repository.NoteRepository;

@RestController
@RequestMapping("/appl")
public class NoteController {
	@Autowired
	NoteRepository noteRepository;
	
	@GetMapping("/notes")
	public List<Note>getAllnotes(){
		System.out.println("Inside Get all notes");
		return noteRepository.findAll();
		
	}
	
	
	@GetMapping("notes/{id}")
	public Note getNoteById(@PathVariable(value="id") Long noteId) {
		return noteRepository.findById(noteId).orElseThrow(()-> new ResourceNotFoundException("Note", "id", noteId));
		
	}
	
	@PostMapping("/notes")
	public Note addNote(@Valid @RequestBody Note note) {
		return noteRepository.save(note);
		
	}
	@PutMapping("note/{id}")
	public Note updateNote(@PathVariable(value="id") Long noteId, @RequestBody Note note) {
		Note notes=noteRepository.findById(noteId).orElseThrow(()->new ResourceNotFoundException("Note", "id", noteId));
		notes.setTitle(note.getTitle());
		notes.setContent(note.getContent());
		Note updateNote=noteRepository.save(notes);
		return updateNote;
	
	}
	
	@DeleteMapping("note/{id}")
	public ResponseEntity<?>deleteNote(@PathVariable(value="id") Long noteId){
		Note note=noteRepository.findById(noteId).orElseThrow(()->new ResourceNotFoundException("Note", "id", noteId));
		noteRepository.delete(note);
		return ResponseEntity.ok().build();
		
		
	}
}
