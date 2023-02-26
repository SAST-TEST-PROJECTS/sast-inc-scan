package io.mend.analysis.repo.sasttest.model;

import org.springframework.stereotype.Service;

@Service
public class Model3 {

  public int increment(int a) {
    return ++a;
  }
}
