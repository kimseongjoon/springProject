package my.spring.vo.Board;


import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@ToString
@Entity
@Table(name = "faq_board")
public class FaqBoardVo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
//  private String category;
  @ManyToOne(fetch = FetchType.LAZY)
  private FaqCategoryVo category;
  private String title;
  private String content;
  @CreationTimestamp
  private java.sql.Timestamp createdAt;
  @UpdateTimestamp
  private java.sql.Timestamp modifiedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public FaqCategoryVo getCategory() {
    return category;
  }

  public void setCategory(FaqCategoryVo category) {
    if (category != null) {
      this.category = category;
    }

  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getModifyAt() {
    return modifiedAt;
  }

  public void setModifyAt(java.sql.Timestamp modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

}
