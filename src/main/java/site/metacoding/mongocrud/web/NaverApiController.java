package site.metacoding.mongocrud.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.mongocrud.domain.Naver;
import site.metacoding.mongocrud.domain.NaverRepository;

@RequiredArgsConstructor
@RestController
public class NaverApiController {
    private final NaverRepository naverRepository;

    @GetMapping("/navers")
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(naverRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/navers")
    public ResponseEntity<?> save(@RequestBody Naver naver) {
        return new ResponseEntity<>(naverRepository.save(naver), HttpStatus.CREATED);
    }
}
