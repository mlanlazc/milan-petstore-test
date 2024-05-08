package io.github.mlanlazc;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
  DEFAULT("https://example.com");

  private final String url;

  public String getUrl() {
    return this.url;
  }
}
