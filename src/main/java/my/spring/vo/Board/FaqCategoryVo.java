package my.spring.vo.Board;


import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "faq_category")
@ToString
public class FaqCategoryVo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @ColumnDefault(value = "0")
  private long parent = 0;
  private String name;
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


  public long getParent() {
    return parent;
  }

  public void setParent(long parent) {
    this.parent = parent;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
