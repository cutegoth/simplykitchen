package com.kis.simplykitchen.dto;

import com.kis.simplykitchen.models.Tags;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class TagsRequest {
    private Set<Tags> tags;
}
