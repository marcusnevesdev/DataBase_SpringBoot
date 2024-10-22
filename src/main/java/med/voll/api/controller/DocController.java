package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.DocRegisterData;
import med.voll.api.doctor.Medico;
import med.voll.api.doctor.MedicoRepository;
import med.voll.api.medico.listDocData;
import med.voll.api.medicos.UpdateDocData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class DocController {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    @PostMapping
    public void register(@RequestBody @Valid DocRegisterData data ){
        repository.save(new Medico(data));
    }

    @GetMapping
    public Page<listDocData> list(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(listDocData::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdateDocData data){
        var medico = repository.getReferenceById(data.id());
        medico.updateInfo(data);
    }

}
