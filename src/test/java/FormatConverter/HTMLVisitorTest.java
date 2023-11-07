package FormatConverter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HTMLVisitorTest {


    @Test
    void shouldReturnHTML(){
        CSVDocument csvDocument = new CSVDocument();
        csvDocument.setHeaders(List.of("Nome", "Idade"));
        csvDocument.setRows(List.of(List.of("João", "20"), List.of("Maria", "30")));
        HTMLVisitor htmlVisitor = new HTMLVisitor();
        csvDocument.accept(htmlVisitor);
        assertEquals("<table>\n<tr>\n<th>Nome</th>\n<th>Idade</th>\n</tr>\n<tr>\n<td>João</td>\n<td>20</td>\n</tr>\n<tr>\n<td>Maria</td>\n<td>30</td>\n</tr>\n</table>\n", htmlVisitor.getResult());
    }
}