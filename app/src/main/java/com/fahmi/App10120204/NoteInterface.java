package com.fahmi.App10120204;
/**
 * Nim : 10120204
 * Nama : Fahmi Muhamad Romdoni
 * Kelas : IF 5
 */
import android.database.Cursor;

import com.fahmi.App10120204.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}
