package guru.springframework.sfgpetclinic.model;

import com.fasterxml.jackson.databind.ser.Serializers;

public class Specialty extends Serializers.Base {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
