package FirstProject.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private String status;

    public MessageDTO(){
        this.status = "Voto Nao Confirmado";
    }
}
