package FormatConverter;

import java.util.List;

public class HTMLVisitor implements Visitor{

    private String html;
    @Override
    public void visit(CSVDocument csvDocument) {
        String html = "<table>\n";

        html += "<tr>\n";
        for (String header : csvDocument.getHeaders()) {
            html += "<th>" + header + "</th>\n";
        }
        html += "</tr>\n";


        for (List<String> row : csvDocument.getRows()) {
            html += "<tr>\n";
            for (String element : row) {
                html += "<td>" + element + "</td>\n";
            }
            html += "</tr>\n";
        }
        html += "</table>\n";
        this.html = html;
    }

    @Override
    public String getResult() {
        return html;
    }
}

/*
<table>
  <tr>
    <th>Company</th>
    <th>Contact</th>
    <th>Country</th>
  </tr>
  <tr>
    <td>Alfreds Futterkiste</td>
    <td>Maria Anders</td>
    <td>Germany</td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
  </tr>
</table>
* */