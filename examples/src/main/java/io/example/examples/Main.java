package io.github.mlanlazc.examples;

import io.github.mlanlazc.Milanpetstoretest;
import io.github.mlanlazc.exceptions.ApiException;

public class Main {

  public static void main(String[] args) {
    Milanpetstoretest client = new Milanpetstoretest();
    try {
      Object response = client.petsService.listPets(9);
      System.out.println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
