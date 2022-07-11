package com.hunglp.basicspecification.domain.common.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class SearchRequest implements Serializable {

    private static final long serialVersionUID = 6459322912929303935L;

    private Integer page;

    private Integer size;

    List<FilterRequest> filters;

    List<SortRequest> sorts;

    public List<FilterRequest> getFilters() {
        return Objects.isNull(filters) ? new ArrayList<>() : filters;
    }

    public List<SortRequest> getSorts(){
        return Objects.isNull(sorts) ? new ArrayList<>() : sorts;
    }

}
