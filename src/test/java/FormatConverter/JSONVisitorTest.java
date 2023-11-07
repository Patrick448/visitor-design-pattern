package FormatConverter;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JSONVisitorTest {
    @Test
    void shouldReturnJSON(){
        CSVDocument csvDocument = new CSVDocument();
        csvDocument.setHeaders(List.of("Nome", "Idade"));
        csvDocument.setRows(List.of(List.of("João", "20"), List.of("Maria", "30")));
        JSONVisitor jsonVisitor = new JSONVisitor();
        csvDocument.accept(jsonVisitor);
        assertEquals("""
                {
                "0":{
                "Nome":"João",
                "Idade":"20"}
                "1":{
                "Nome":"Maria",
                "Idade":"30"}
                }
                """, jsonVisitor.getResult());
    }
}