package org.courtesilol.Brivox.db.repository;

import org.courtesilol.Brivox.db.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ruizn
 */
public interface FileRepository extends JpaRepository<FileEntity, Long> {
    FileEntity findFileById(long id);
}
