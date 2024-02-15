// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.novel.repository;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.entity.novel.model.Novel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
// ✦•······················• IMPORTS - END •······················•✦ //

@Repository
public interface NovelRepository extends JpaRepository<Novel, UUID> {
}
