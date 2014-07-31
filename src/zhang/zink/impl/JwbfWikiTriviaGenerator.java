package zhang.zink.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

import org.sweble.wikitext.engine.CompiledPage;
import org.sweble.wikitext.engine.Compiler;
import org.sweble.wikitext.engine.CompilerException;
import org.sweble.wikitext.engine.PageId;
import org.sweble.wikitext.engine.PageTitle;
import org.sweble.wikitext.engine.utils.SimpleWikiConfiguration;
import org.sweble.wikitext.lazy.LinkTargetException;

import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import zhang.zink.interfaces.Question;
import zhang.zink.interfaces.Topic;
import zhang.zink.interfaces.WikiTriviaGenerator;

public class JwbfWikiTriviaGenerator implements WikiTriviaGenerator {

    private JwbfWikiTriviaGenerator() {

    }

    public static JwbfWikiTriviaGenerator create() {
        return new JwbfWikiTriviaGenerator();
    }

    @Override
    public Collection<Topic> getTopics() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Question> getQuestionsForTopic(Topic topic, int numberOfQuestions) {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, CompilerException, LinkTargetException {
        MediaWikiBot wikiBot = new MediaWikiBot("http://en.wikipedia.org/w/");
        Article article = wikiBot.getArticle("Roller Coaster Corporation of America");
        System.out.println(article.getText());
/**/
        SimpleWikiConfiguration config = new SimpleWikiConfiguration("classpath:/org/sweble/wikitext/engine/SimpleWikiConfiguration.xml");
        PageTitle pageTitle = PageTitle.make(config, "Foo");
        PageId pageId = new PageId(pageTitle, -1);
        Compiler compiler = new Compiler(config);
        CompiledPage compiledPage = compiler.parse(pageId, article.getText(), null);
        System.out.println(compiledPage.toString());
/**/
    }

}
