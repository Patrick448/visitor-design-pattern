package FormatConverter;

public interface Visitor {

    public void visit(CSVDocument csvDocument);
    public String getResult();

}
