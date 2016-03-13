package org.sandbox.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Александр on 01.02.2016.
 */
public class DateSerializer extends JsonSerializer {

    @Override
    public void serialize(Object object, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        Date d = (Date) object;
        jsonGenerator.writeString(new SimpleDateFormat("dd-MM-YYYY").format(d));
    }
}
