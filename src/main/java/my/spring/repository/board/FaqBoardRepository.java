package my.spring.repository.board;

import my.spring.vo.Board.FaqBoardVo;
import my.spring.vo.Board.FaqCategoryVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FaqBoardRepository extends JpaRepository<FaqBoardVo, Long> {
    List<FaqBoardVo> findByCategory(FaqCategoryVo category);
    List<FaqBoardVo> findByCategory_Name(@Param(value = "categoryName")String categoryName);
    List<FaqBoardVo> findByCategory_Id(@Param(value = "categoryId")long categoryId);

}
