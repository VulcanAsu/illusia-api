// ✦•······················• PACKAGE - START •······················•✦ //
package br.com.illusia.api.entity.novel.model;
// ✦•······················• PACKAGE - END •······················•✦ //

// ✦•······················• IMPORTS - START •······················•✦ //
import br.com.illusia.api.infrastructure.enumerated.NovelType;
import br.com.illusia.api.infrastructure.enumerated.StatusNovel;
import br.com.illusia.api.infrastructure.model.PersistenceEntity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
// ✦•······················• IMPORTS - END •······················•✦ //

/**
 * Entidade central do sistema.
 *
 * @author Giovane Neves
 * @since v1
 */
@Table(name = "novels")
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Novel extends PersistenceEntity {

    // ✦•······················• ATTRIBUTES - START •······················•✦ //
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "publish_date", nullable = false)
    private LocalDateTime publishDate;
    @ElementCollection
    @CollectionTable(name = "alternative_titles", joinColumns = @JoinColumn(name = "entity_id"))
    @Column(name = "alternative_titles")
    private List<String> alternativeTitles;
    @Column(name = "total_chapters", nullable = false)
    private long totalChapters;
    @Column(name = "natinality", nullable = false)
    private String nationality;
    @Column(name = "sinopsys", columnDefinition = "TEXT", nullable = false)
    private String sinopsys;
    @Enumerated(value = EnumType.STRING)
    private StatusNovel status;
    @Enumerated(value = EnumType.STRING)
    private NovelType type;
    // ✦•······················• ATTRIBUTES - END •······················•✦ //

}
