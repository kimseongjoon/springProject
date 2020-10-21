package my.spring.repository.board;

import my.spring.vo.Board.NoticeBoardVo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeBoardRepository extends JpaRepository<NoticeBoardVo, Long> {
}
