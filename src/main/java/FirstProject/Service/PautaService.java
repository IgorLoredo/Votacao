package FirstProject.Service;

import FirstProject.DTO.Request.PautaRequestDTO;
import FirstProject.DTO.Response.PautaResponseDTO;

public interface PautaService {

    public PautaResponseDTO createPauta(PautaRequestDTO requestDTO);
}
