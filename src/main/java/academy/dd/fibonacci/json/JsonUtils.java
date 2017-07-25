package academy.dd.fibonacci.json;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by stevewalton on 21/07/2017.
 */
public final class JsonUtils {
    public static String toString(Object object) throws IOException {
        return new ObjectMapper().writeValueAsString(object);
    }
}
