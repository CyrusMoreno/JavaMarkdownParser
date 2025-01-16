import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A utility class for converting Markdown text to HTML.
 *
 * @author Cyrus E. Moreno
 * @coauthor Copilot
 */

public class Markdown {

       /**
       * Converts the given Markdown text to HTML.
       *
       * @param markdown The Markdown text to be converted.
       * @return The converted HTML text.
       */

    public static String convertMarkdownToHtml(String markdown) {
        String html = markdown;

        // Convert headings
        html = html.replaceAll("(?m)^# (.+)$", "<h1>$1</h1>");
        html = html.replaceAll("(?m)^## (.+)$", "<h2>$1</h2>");
        html = html.replaceAll("(?m)^### (.+)$", "<h3>$1</h3>");
        // Add more heading levels if needed

        // Convert bold and italic
        html = html.replaceAll("\\*\\*(.+?)\\*\\*", "<b>$1</b>");
        html = html.replaceAll("\\*(.+?)\\*", "<i>$1</i>");

        // Convert line breaks
        html = html.replaceAll("(?m)^\\s*$", "<br/>");

        return html;
    }
}
