package kr.re.kitri.lucidDream.common;

import kr.re.kitri.lucidDream.model.Article;

import java.util.ArrayList;
import java.util.List;


public class MockArticle {

    public List<Article> getArticles() {
        List<Article> list = new ArrayList<>();

        Article a = new Article();
        a.setArticleId("1");
        a.setTitle("1번 게시물입니다");
        a.setAuthor("박찬호");
        a.setContent("dddddddddddd");
        list.add(a);

        a = new Article();
        a.setArticleId("2");
        a.setTitle("2번 게시물입니다");
        a.setAuthor("박세리");
        a.setContent("골프선수 박세리입니다.");
        list.add(a);

        a = new Article();
        a.setArticleId("3");
        a.setTitle("3번 게시물입니다");
        a.setAuthor("스칼렛 요한슨");
        a.setContent("탁월한 여배우입니다 ");
        list.add(a);

        a = new Article();
        a.setArticleId("4");
        a.setTitle("4번 게시물입니다");
        a.setAuthor("백종원");
        a.setContent("백종원마늘장아찌 담그기 ");
        list.add(a);

        a = new Article();
        a.setArticleId("5");
        a.setTitle("5번 게시물입니다");
        a.setAuthor("오오츠카 아이");
        a.setContent("일본에서 유명한 가수입니다. 2007년 일본레코드대상 금상을 받았습니다. ");
        list.add(a);

       return list;
    }
}
