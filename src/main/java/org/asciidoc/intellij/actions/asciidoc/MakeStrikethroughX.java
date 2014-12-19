package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeStrikethroughX extends FormatAsciiDocAction {
  @Override
  public String getName() {
    return "MakeStrikethrough";
  }

  @Override
  public String updateSelection(String asciidoc) {
    return "[line-through]#" + asciidoc + "#";
  }
}