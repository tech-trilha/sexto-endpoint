package com.techtrilha.sextoendpoint.control;

import com.techtrilha.sextoendpoint.model.Remedy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @DeleteMapping("/remedies/{id}")
  public Remedy updateRemedy(@PathVariable("id") Long id) {
    if (id == 1) {
      final var remedy = new Remedy();
      remedy.setId(1L);
      remedy.setName("Xarope");
      remedy.setDescription("Para tosse ou irritacao");
      return remedy;
    }
    return null;
  }

}
