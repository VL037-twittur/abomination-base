package vincentlow.twittur.base.web.model.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageMetaData implements Serializable {

  private static final long serialVersionUID = 6927667702020828247L;

  private long pageNumber;

  private long pageSize;

  private long totalRecords;

  @Override
  public String toString() {

    return "PageMetaData{" +
        "pageSize=" + pageSize +
        ", pageNumber=" + pageNumber +
        ", totalRecords=" + totalRecords +
        '}';
  }
}
