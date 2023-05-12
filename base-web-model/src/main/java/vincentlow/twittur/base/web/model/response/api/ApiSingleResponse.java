package vincentlow.twittur.base.web.model.response.api;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // default const for JACKSON
@AllArgsConstructor
public class ApiSingleResponse<T> extends ApiResponse {

  private static final long serialVersionUID = 2197712303730261146L;

  private T data;

  public ApiSingleResponse(HttpStatus httpStatus, String error, T data) {

    super(httpStatus, error);
    this.data = data;
  }

  @Override
  public String toString() {

    return "SingleResponse{" +
        "value=" + data +
        '}';
  }
}
