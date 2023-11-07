package FormatConverter;

import java.util.List;

public class CSVDocument implements Visitable{

    private List<String> headers;
    private List<List<String>> rows;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public List<List<String>> getRows() {
        return rows;
    }

    public void setRows(List<List<String>> rows) {
        this.rows = rows;
    }
}
