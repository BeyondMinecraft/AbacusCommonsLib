package net.minecraft.command;
import java.util.Collections;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Gregory
 */
public class GregoryChatHandler implements ICommand, ICommandManager {
  private List<String> commandAliases;
  private List<String> possibleCommands;
  private Map<String, String> commands;
  private String commandName;
  private String commandUsage;

  public GregoryChatHandler() {
  }

  @Override
  public List<String> addTabCompletionOptions(ICommandSender icommandsender, String[] astring) {
    return null;
  }

  @Override
  public List<String> getCommandAliases() {
    return Collections.unmodifiableList(commandAliases);
  }

  @Override
  public List<String> getPossibleCommands(ICommandSender icommandsender) {
    return Collections.unmodifiableList(possibleCommands);
  }

  @Override
  public List<String> getPossibleCommands(ICommandSender icommandsender, String s) {
    return Collections.unmodifiableList(possibleCommands);
  }

  @Override
  public Map<String, String> getCommands() {
    return Collections.unmodifiableMap(commands);
  }

  @Override
  public String getCommandName() {
    return commandName;
  }

  @Override
  public String getCommandUsage(ICommandSender icommandsender) {
    return commandUsage;
  }

  @Override
  public boolean canCommandSenderUseCommand(ICommandSender icommandsender) {
    return false;
  }

  @Override
  public boolean isUsernameIndex(String[] astring, int i) {
    return false;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  @Override
  public int executeCommand(ICommandSender icommandsender, String s) {
    return 0;
  }

  @Override
  public void processCommand(ICommandSender icommandsender, String[] astring) {
  }
}
