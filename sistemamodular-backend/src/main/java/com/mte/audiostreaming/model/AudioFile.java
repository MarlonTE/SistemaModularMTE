package com.mte.audiostreaming.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AudioFile {
    @Id
    private Long id;
    private String name;
    private String path;
}
