package com.codeclan.filesandfolders.filesandfolders.repositories;


import com.codeclan.filesandfolders.filesandfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
