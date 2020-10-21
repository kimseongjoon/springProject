package my.spring.Controller.Board;

import my.spring.vo.Board.NoticeBoardVo;
import my.spring.repository.board.NoticeBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/notice")
public class NoticeBoardController {

    @Autowired
    private NoticeBoardRepository repository;

    @GetMapping
    public Page<NoticeBoardVo> noticeList(final Pageable pageable){
        Page<NoticeBoardVo> list = repository.findAll(pageable);

        return list;
    }

    @PostMapping
    public void registerNotice(@RequestBody NoticeBoardVo notice) {
        repository.save(notice);
    }

}
