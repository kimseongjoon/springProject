package my.spring.repository.board;

import my.spring.vo.Board.FaqCategoryVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaqCategoryRepository extends JpaRepository<FaqCategoryVo, Long> {
    FaqCategoryVo findByName(String name);
}
