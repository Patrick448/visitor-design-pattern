package FormatConverter;

import java.util.List;

public class JSONVisitor implements Visitor{

    private String json;
    @Override
    public void visit(CSVDocument csvDocument) {
        String json = "{\n";
        int count =0;

        for(List<String> row: csvDocument.getRows()){
            json+= "\""+count+"\":{\n";
            for(int i=0; i< csvDocument.getHeaders().size(); i++){
                String attr = csvDocument.getHeaders().get(i);
                String value = row.get(i);
                json+= "\""+attr+"\":\""+value+"\",\n";

            }

            json = json.substring(0, json.length() - 2);
            json+= "}\n";
            count++;
        }


        json+= "}\n";

        this.json = json;
    }

    @Override
    public String getResult() {
        return json;
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