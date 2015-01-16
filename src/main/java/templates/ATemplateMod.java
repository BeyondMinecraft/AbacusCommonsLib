package templates;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppedEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;


/**
 * A main mod template interface that anyone can implement as the baseline to their mod.<p/>
 * This implementation does not automatically include a {@code @Mod} or other annotation; you should be able to add them
 * manually. And you should also manually copy the {@code @EventHandler} annotation to before each of the methods.<p/>
 * Further:
 * <ul>
 * <li/>The {@code before}, {@code during}, and {@code finish} methods are for pre-initialization, initialization, and
 * post-initialization events, respectively. They are recommended for all mods (even though most mods do not have a lot
 * to do in the post-initialization phase).
 * <li/>The {@code serverStartBefore}, {@code serverStartDuring}, {@code serverStartFinish}, {@code serverStopDuring},
 * and {@code serverStopFinish} methods are for the life-cycle events in a mod's lifetime; these only need to be used
 * when the mod is usable as a server-side instance, or a client-side instance based upon server-side co-operability.
 * It is acceptable to leave them empty if unneeded.
 * <li/>The {@code fingerprintviolation} and {@code intermodcommunication} methods are for handling what they say.
 * Fingerprinting is a security feature for identifying a mod's signature; an inter-mod communications allow mods to say
 * something to other mods.
 * </ul>
 * @author Gregory
 * @see #before(FMLPreInitializationEvent) before(FMLPreInitializationEvent)
 * @see #during(FMLInitializationEvent) during(FMLInitializationEvent)
 * @see #finish(FMLPostInitializationEvent) finish(FMLPostInitializationEvent)
 * @see #serverStartBefore(FMLServerAboutToStartEvent) serverStartBefore(FMLServerAboutToStartEvent)
 * @see #serverStartDuring(FMLServerStartingEvent) serverStartDuring(FMLServerStartingEvent)
 * @see #serverStartFinish(FMLServerStartedEvent) serverStartFinish(FMLServerStartedEvent)
 * @see #serverStopDuring(FMLServerStoppingEvent) serverStopDuring(FMLServerStoppingEvent)
 * @see #serverStopFinish(FMLServerStoppedEvent) serverStopFinish(FMLServerStoppedEvent)
 * @see #fingerprintviolation(FMLFingerprintViolationEvent) fingerprintviolation(FMLFingerprintViolationEvent)
 * @see #intermodcommunication(FMLInterModComms.IMCEvent) intermodcommunication(FMLInterModComms.IMCEvent)
 */
public interface ATemplateMod {
  /**
   * A public method to handle the client-side pre-initialization functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLPreInitializationEvent} parameter:
   * <pre>
   * FMLPreInitializationEvent:
   * Run before anything else.
   * Read your config, create blocks, items, etc, and register them with the GameRegistry.
   * </pre>
   * @param event A Forge event handler for the beginning phase of mod loading.
   */
  @EventHandler
  abstract public void before(FMLPreInitializationEvent event);

  /**
   * A public method to handle the client-side initialization functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLInitializationEvent} parameter:
   * <pre>
   * FMLInitializationEvent:
   * Do your mod setup.
   * Build whatever data structures you care about.
   * Register recipes, send FMLInterModComms messages to other mods.
   * </pre>
   * @param event A Forge event handler for the middle phase of mod loading.
   */
  @EventHandler
  abstract public void during(FMLInitializationEvent event);

  /**
   * A public method to handle the client-side post-initialization functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLPostInitializationEvent} parameter:
   * <pre>
   * FMLPostInitializationEvent:
   * Handle interaction with other mods, complete your setup based on this.
   * </pre>
   * @param event A Forge event handler for the ending phase of mod loading.
   */
  @EventHandler
  abstract public void finish(FMLPostInitializationEvent event);

  /**
   * A public method to handle the server-side pre-starting functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLServerAboutToStartEvent} parameter:
   * <pre>
   * FMLServerAboutToStartEvent:
   * Use if you need to handle something before the server has even been created.
   * </pre>
   * @param event A Forge event handler for when the server has not yet started.
   */
  @EventHandler
  abstract public void serverStartBefore(FMLServerAboutToStartEvent event);

  /**
   * A public method to handle the server-side starting functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLServerStartingEvent} parameter:
   * <pre>
   * FMLServerStartingEvent:
   * Do stuff you need to do to set up the server.
   * register commands,
   * tweak the server.
   * </pre>
   * TODO: If you have an ICommand class to be registered specifically on the server-side, then...
   * <pre>
   * event.registerServerCommand(null);
   * </pre>
   * and for the rest of it, you can use the accessible event methods.
   * @param event A Forge event handler for when the server is beginning to start.
   */
  @EventHandler
  abstract public void serverStartDuring(FMLServerStartingEvent event);

  /**
   * A public method to handle the server-side post-starting functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLServerStartedEvent} parameter:
   * <pre>
   * FMLServerStartedEvent:
   * Do what you need to with the running server.
   * </pre>
   * @param event A Forge event handler for when the server is finishing to start.
   */
  @EventHandler
  abstract public void serverStartFinish(FMLServerStartedEvent event);

  /**
   * A public method to handle the server-side stopping functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLServerStoppingEvent} parameter:
   * <pre>
   * FMLServerStoppingEvent:
   * Do what you need to before the server has started its shutdown sequence.
   * </pre>
   * @param event A Forge event handler for when the server is beginning to end.
   */
  @EventHandler
  abstract public void serverStopDuring(FMLServerStoppingEvent event);

  /**
   * A public method to handle the server-side stopped functionality.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLServerStoppedEvent} parameter:
   * <pre>
   * FMLServerStoppedEvent:
   * Do whatever cleanup you need once the server has shutdown.
   * Generally only useful on the integrated server.
   * </pre>
   * @param event A Forge event handler for when the server is finishing to end.
   */
  @EventHandler
  abstract public void serverStopFinish(FMLServerStoppedEvent event);

  /**
   * A public method to handle if your mod's signature is invalidated, perhaps to provide some failing message.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link FMLFingerprintViolationEvent} parameter:
   * <pre>
   * FMLFingerprintViolationEvent:
   * Sent just before FMLPreInitializationEvent if something is wrong with your mod signature
   * </pre>
   * @param event A Forge event handler for "fingerprint" errata.
   */
  @EventHandler
  abstract public void fingerprintviolation(FMLFingerprintViolationEvent event);

  /**
   * A public method to handle what happens in an "inter-mod communication" phase.<p/>
   * From the {@link EventHandler} javadoc for methods using the {@link IMCEvent} parameter:
   * <pre>
   * IMCEvent:
   * Sent just after FMLInitializationEvent if you have IMC messages waiting from other mods
   * </pre>
   * and in IMCEvent itself:
   * <pre>
   * Subscribe to this event to receive your messages (they are sent between Init and PostInit)
   * </pre>
   * So I assume this means that any other mods that post IMC messages will be delivered, via Forge handling, to the
   * appropriate mods; if this mod is the recipient of such a message, this method should be used to process it.
   * @param event A Forge event handler for inter-mod communications
   */
  @EventHandler
  abstract public void intermodcommunication(IMCEvent event);
}
