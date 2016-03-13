package org.sandbox.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.sandbox.utils.DateSerializer;

import java.util.Date;

/**
 * Created by Александр on 01.02.2016.
 */

@JsonAutoDetect
public class Book {

    private String title;
    private String annotation;
    @JsonSerialize(using = DateSerializer.class)
    private Date dateOfPublishing;
    private Integer pageCount;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(Date dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }
}
