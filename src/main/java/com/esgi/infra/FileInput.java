package com.esgi.infra;

import com.esgi.domain.Input;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileInput implements Input {
    private final String filename;

    public FileInput(String filename) {
        this.filename = filename;
    }

    @Override
    public List<String> getInput() {
        try {
            return Files.readAllLines(Path.of(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
