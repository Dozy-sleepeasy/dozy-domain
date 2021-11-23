package pluviophile.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreUserRequest {
    private String type;
    private String phoneNum;
    private String url;
}

