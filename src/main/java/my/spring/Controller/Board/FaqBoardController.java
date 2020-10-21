package my.spring.Controller.Board;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import my.spring.repository.board.FaqBoardRepository;
import my.spring.repository.board.FaqCategoryRepository;
import my.spring.vo.Board.FaqBoardVo;
import my.spring.vo.Board.FaqCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("faq")
public class FaqBoardController {

    @Autowired
    FaqBoardRepository repository;

    @Autowired
    FaqCategoryRepository catRepository;

    @GetMapping
    /*public Page<FaqBoardVo> faqList(final Pageable pageable) {
        Page<   FaqBoardVo> page = repository.findAll(pageable);
        for (FaqBoardVo faqBoardVo : page.getContent()) {
            System.out.println("faq :" + faqBoardVo);
        }

        return page;
    }*/
    public List<FaqBoardVo> faqList(@RequestParam("cat") String cat) {
        List<FaqBoardVo> page = null;
        if (cat.equals("call")) {
            /*FaqCategoryVo faqCategoryVo = catRepository.findByName("주문");
            if (faqCategoryVo != null) {
                page = repository.findByCategory(faqCategoryVo);
            }*/

            try {
                page = repository.findByCategory_Name("주문");
            } catch (Exception e) {

                page = repository.findByCategory_Id(1);
            }
        } else if (cat.equals("trans")) {
            /*FaqCategoryVo faqCategoryVo = catRepository.findByName("배송");
            if (faqCategoryVo != null) {
                page = repository.findByCategory(faqCategoryVo);
            }*/
            page = repository.findByCategory_Name("배송");
        } else {
            page = repository.findAll();
        }

        for (FaqBoardVo vo : page) {
            System.out.println("faq : " + vo);
        }

        return page;
    }

    @PostMapping
    public void registerFaq(@RequestBody FaqBoardVo faq) {
        repository.save(faq);
    }
}
