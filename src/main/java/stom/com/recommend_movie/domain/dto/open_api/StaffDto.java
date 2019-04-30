package stom.com.recommend_movie.domain.dto.open_api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "staff")
public class StaffDto {
    private String staffNm;
    private String staffRoleGroup;
    private String staffRole;
    private String staffEtc;
    private String staffId;

    @Builder
    public StaffDto(String staffNm, String staffRoleGroup, String staffRole, String staffEtc, String staffId) {
        this.staffNm = staffNm;
        this.staffRoleGroup = staffRoleGroup;
        this.staffRole = staffRole;
        this.staffEtc = staffEtc;
        this.staffId = staffId;
    }
}
