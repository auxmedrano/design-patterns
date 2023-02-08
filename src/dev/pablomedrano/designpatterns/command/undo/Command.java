package dev.pablomedrano.designpatterns.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
