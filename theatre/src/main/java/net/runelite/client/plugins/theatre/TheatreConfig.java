/*
 * THIS PLUGIN WAS WRITTEN BY A KEYBOARD-WIELDING MONKEY BOI BUT SHUFFLED BY A KANGAROO WITH THUMBS.
 * The plugin and it's refactoring was intended for xKylee's Externals but I'm sure if you're reading this, you're probably planning to yoink..
 * or you're just genuinely curious. If you're trying to yoink, it doesn't surprise me.. just don't claim it as your own. Cheers.
 */

package net.runelite.client.plugins.theatre;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigTitleSection;
import net.runelite.client.config.Range;

@ConfigGroup("Theatre")
public interface TheatreConfig extends Config
{
	@ConfigTitleSection(
		name = "General",
		description = "",
		position = 0,
		keyName = "generalSection"
	)
	default boolean generalSection()
	{
		return true;
	}

	@Range(max = 20)
	@ConfigItem(
		position = 0,
		keyName = "theatreFontSize",
		name = "Theatre Overlay Font Size",
		description = "Sets the font size for all theatre text overlays",
		titleSection = "generalSection"
	)
	default int theatreFontSize()
	{
		return 12;
	}

	@ConfigTitleSection(
		name = "Maiden",
		description = "Maiden's Configuration",
		position = 1,
		keyName = "maidenSection"
	)
	default boolean maidenSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "maidenBlood",
		name = "Maiden Blood Attack Marker",
		description = "Highlights Maiden's Blood Pools",
		titleSection = "maidenSection"
	)
	default boolean maidenBlood()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "maidenSpawns",
		name = "Maiden Blood Spawns Marker",
		description = "Highlights Maiden Blood Spawns (Tomatoes)",
		titleSection = "maidenSection"
	)
	default boolean maidenSpawns()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "maidenReds",
		name = "Maiden Reds Health Overlay",
		description = "Displays the health of each red crab",
		titleSection = "maidenSection"
	)
	default boolean maidenRedsHealth()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "maidenRedsDistance",
		name = "Maiden Reds Distance Overlay",
		description = "Displays the distance of each red crab to reach Maiden",
		titleSection = "maidenSection"
	)
	default boolean maidenRedsDistance()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "MaidenTickCounter",
		name = "Maiden Tank Tick Counter",
		description = "Displays the tick counter for when she decides who to choose for tanking",
		titleSection = "maidenSection"
	)
	default boolean maidenTickCounter()
	{
		return true;
	}

	@ConfigTitleSection(
		name = "Bloat",
		description = "Bloat's Configuration",
		position = 2,
		keyName = "bloatSection"
	)
	default boolean bloatSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "bloatIndicator",
		name = "Bloat Tile Indicator",
		description = "Highlights Bloat's Tile",
		titleSection = "bloatSection"
	)
	default boolean bloatIndicator()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "bloatTickCounter",
		name = "Bloat Tick Counter",
		description = "Displays the tick counter for how long Bloat has been up or down",
		titleSection = "bloatSection"
	)
	default boolean bloatTickCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "bloatHands",
		name = "Bloat Hands Overlay",
		description = "Highlights the tiles where Bloat's hands will fall",
		titleSection = "bloatSection"
	)
	default boolean bloatHands()
	{
		return false;
	}

	@Alpha
	@ConfigItem(
		position = 4,
		keyName = "bloatHandsColor",
		name = "Bloat Hands Overlay Color",
		description = "Select a color for the Bloat Hands Overlay to be",
		titleSection = "bloatSection"
	)
	default Color bloatHandsColor()
	{
		return Color.CYAN;
	}

	@ConfigTitleSection(
		name = "Nylocas",
		description = "Nylocas' Configuration",
		position = 3,
		keyName = "nylocasSection"
	)
	default boolean nylocasSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "nyloPillars",
		name = "Nylocas Pillar Health Overlay",
		description = "Displays the health percentage of the pillars",
		titleSection = "nylocasSection"
	)
	default boolean nyloPillars()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "nyloExplosions",
		name = "Nylocas Explosion Tile Warning",
		description = "Highlights a Nylocas that is about to explode",
		titleSection = "nylocasSection"
	)
	default boolean nyloExplosions()
	{
		return true;
	}

	@Range(max = 52)
	@ConfigItem(
		position = 3,
		keyName = "nyloExplosionDisplayTicks",
		name = "Nylocas Display Last Ticks",
		description = "Displays the last 'x' amount of ticks for a Nylocas. (ex: to see the last 10 ticks, you set it to 10)",
		titleSection = "nylocasSection"
	)
	default int nyloExplosionDisplayTicks()
	{
		return 46;
	}

	@ConfigItem(
		position = 4,
		keyName = "nyloTimeAlive",
		name = "Nylocas Tick Time Alive",
		description = "Displays the tick counter of each nylocas spawn (Explodes on 52)",
		titleSection = "nylocasSection"
	)
	default boolean nyloTimeAlive()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "nyloRecolorMenu",
		name = "Nylocas Recolor Menu Options",
		description = "Recolors the menu options of each Nylocas to it's respective attack style",
		titleSection = "nylocasSection"
	)
	default boolean nyloRecolorMenu()
	{
		return false;
	}

	@ConfigItem(
		position = 6,
		keyName = "nyloHighlightOverlay",
		name = "Nylocas Highlight Overlay",
		description = "Select your role to highlight respective Nylocas to attack",
		titleSection = "nylocasSection"
	)
	default boolean nyloHighlightOverlay()
	{
		return false;
	}

	@ConfigItem(
		position = 7,
		keyName = "nyloAliveCounter",
		name = "Nylocas Alive Counter Panel",
		description = "Displays how many Nylocas are currently alive",
		titleSection = "nylocasSection"
	)
	default boolean nyloAlivePanel()
	{
		return false;
	}

	@ConfigItem(
		position = 8,
		keyName = "nyloAggressiveOverlay",
		name = "Highlight Aggressive Nylocas",
		description = "Highlights aggressive Nylocas after they spawn",
		titleSection = "nylocasSection"
	)
	default boolean nyloAggressiveOverlay()
	{
		return true;
	}

	@ConfigItem(
		position = 9,
		keyName = "nyloInstanceTimer",
		name = "Nylocas Instance Timer",
		description = "Displays an instance timer when the next set will potentially spawn",
		titleSection = "nylocasSection"
	)
	default boolean nyloInstanceTimer()
	{
		return false;
	}

	@ConfigItem(
		position = 10,
		keyName = "nyloStallMessage",
		name = "Nylocas Stall Wave Messages",
		description = "Sends a chat message when you have stalled the next wave of Nylocas to spawn due to being capped",
		titleSection = "nylocasSection"
	)
	default boolean nyloStallMessage()
	{
		return false;
	}

	@ConfigItem(
		position = 11,
		keyName = "nyloBossAttackTickCount",
		name = "Nylocas Boss Attack Tick Counter",
		description = "Displays the ticks left until the Nylocas Boss will attack next (LEFT-MOST)",
		titleSection = "nylocasSection"
	)
	default boolean nyloBossAttackTickCount()
	{
		return false;
	}

	@ConfigItem(
		position = 12,
		keyName = "nyloBossSwitchTickCount",
		name = "Nylocas Boss Switch Tick Counter",
		description = "Displays the ticks left until the Nylocas Boss will switch next (MIDDLE)",
		titleSection = "nylocasSection"
	)
	default boolean nyloBossSwitchTickCount()
	{
		return true;
	}

	@ConfigItem(
		position = 13,
		keyName = "nyloBossTotalTickCount",
		name = "Nylocas Boss Total Tick Counter",
		description = "Displays the total ticks since the Nylocas Boss has spawned (RIGHT-MOST)",
		titleSection = "nylocasSection"
	)
	default boolean nyloBossTotalTickCount()
	{
		return false;
	}

	@ConfigTitleSection(
		name = "Sotetseg",
		description = "Sotetseg's Configuration",
		position = 4,
		keyName = "sotetsegSection"
	)
	default boolean sotetsegSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "sotetsegMaze",
		name = "Sotetseg Maze",
		description = "Memorizes Solo Mazes and displays tiles of other chosen players",
		titleSection = "sotetsegSection"
	)
	default boolean sotetsegMaze()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "sotetsegOrbAttacksTicks",
		name = "Sotetseg Small Attack Orb Ticks",
		description = "Displays the amount of ticks until it will hit you (change prayers when you see 1)",
		titleSection = "sotetsegSection"
	)
	default boolean sotetsegOrbAttacksTicks()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "sotetsegAutoAttacksTicks",
		name = "Sotetseg Auto Attack Ticks",
		description = "Displays a tick counter for when Sotetseg will attack next",
		titleSection = "sotetsegSection"
	)
	default boolean sotetsegAutoAttacksTicks()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "sotetsegBigOrbTicks",
		name = "Sotetseg Ball Tick Overlay",
		description = "Displays how many ticks until the ball will explode (eat when you see 1)",
		titleSection = "sotetsegSection"
	)
	default boolean sotetsegBigOrbTicks()
	{
		return true;
	}

	@ConfigTitleSection(
		name = "Xarpus",
		description = "Xarpus's Configuration",
		position = 5,
		keyName = "xarpusSection"
	)
	default boolean xarpusSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "xarpusInstanceTimer",
		name = "Xarpus Instance Timer",
		description = "Displays the Xarpus Instance timer to be tick efficient with the first spawn of an exhumed",
		titleSection = "xarpusSection"
	)
	default boolean xarpusInstanceTimer()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "xarpusExhumed",
		name = "Xarpus Exhumed Markers",
		description = "Highlights the tiles of exhumed spawns",
		titleSection = "xarpusSection"
	)
	default boolean xarpusExhumed()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "xarpusExhumedTick",
		name = "Xarpus Exhumed Ticks",
		description = "Displays how many ticks until the exhumeds will despawn",
		titleSection = "xarpusSection"
	)
	default boolean xarpusExhumedTick()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "xarpusTickP2",
		name = "Xarpus Attack Tick - P2",
		description = "Displays a tick counter for when Xarpus faces a new target to spit at",
		titleSection = "xarpusSection"
	)
	default boolean xarpusTickP2()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "xarpusTickP3",
		name = "Xarpus Attack Tick - P3",
		description = "Displays a tick counter for when Xarpus will rotate",
		titleSection = "xarpusSection"
	)
	default boolean xarpusTickP3()
	{
		return true;
	}

	@ConfigTitleSection(
		name = "Verzik",
		description = "Verzik's Configuration",
		position = 6,
		keyName = "verzikSection"
	)
	default boolean verzikSection()
	{
		return true;
	}

	@ConfigItem(
		position = 1,
		keyName = "verzikTileOverlay",
		name = "Verzik Tile Indicator",
		description = "Highlights Verzik's tile - If you are next to or inside of the indicator, you can be meleed",
		titleSection = "verzikSection"
	)
	default boolean verzikTileOverlay()
	{
		return true;
	}

	@ConfigItem(
		position = 2,
		keyName = "verzikProjectiles",
		name = "Verzik Range Tile Markers",
		description = "Highlights the tiles of Verzik's range projectiles",
		titleSection = "verzikSection"
	)
	default boolean verzikProjectiles()
	{
		return true;
	}

	@ConfigItem(
		position = 3,
		keyName = "verzikDisplayTank",
		name = "Verzik Display Tank",
		description = "Highlights the tile of the player tanking to help clarify",
		titleSection = "verzikSection"
	)
	default boolean verzikDisplayTank()
	{
		return true;
	}

	@ConfigItem(
		position = 4,
		keyName = "VerzikRedHP",
		name = "Verzik Reds Health Overlay",
		description = "Displays the health of red crabs during Verzik",
		titleSection = "verzikSection"
	)
	default boolean verzikReds()
	{
		return true;
	}

	@ConfigItem(
		position = 5,
		keyName = "verzikAutosTick",
		name = "Verzik Attack Tick Counter",
		description = "Displays the ticks until Verzik will attack next",
		titleSection = "verzikSection"
	)
	default boolean verzikAutosTick()
	{
		return true;
	}

	@ConfigItem(
		position = 6,
		keyName = "verzikAttackCounter",
		name = "Verzik Attack Counter",
		description = "Displays Verzik's Attack Count (useful for when P2 reds as they despawn after the 7th attack)",
		titleSection = "verzikSection"
	)
	default boolean verzikAttackCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 7,
		keyName = "verzikTotalTickCounter",
		name = "Verzik Total Tick Counter",
		description = "Displays the total amount of ticks Verzik has been alive for",
		titleSection = "verzikSection"
	)
	default boolean verzikTotalTickCounter()
	{
		return true;
	}

	@ConfigItem(
		position = 8,
		keyName = "verzikNyloPersonalWarning",
		name = "Verzik Nylo Direct Aggro Warning",
		description = "Highlights the Nylocas that are targeting YOU and ONLY you",
		titleSection = "verzikSection"
	)
	default boolean verzikNyloPersonalWarning()
	{
		return true;
	}

	@ConfigItem(
		position = 9,
		keyName = "verzikNyloOtherWarning",
		name = "Verzik Nylo Indirect Aggro Warnings",
		description = "Highlights the Nylocas that are targeting OTHER players",
		titleSection = "verzikSection"
	)
	default boolean verzikNyloOtherWarning()
	{
		return true;
	}

	@ConfigItem(
		position = 10,
		keyName = "verzikNyloExplodeAOE",
		name = "Verzik Nylo Explosion Area",
		description = "Highlights the area of explosion for the Nylocas (Personal or Indirect Warnings MUST be enabled)",
		titleSection = "verzikSection"
	)
	default boolean verzikNyloExplodeAOE()
	{
		return true;
	}

	@ConfigItem(
		position = 11,
		keyName = "verzikYellows",
		name = "Verzik Yellows Overlay",
		description = "Highlights the yellow pools and displays the amount of ticks until you can move away or tick eat",
		titleSection = "verzikSection"
	)
	default boolean verzikYellows()
	{
		return true;
	}

	@ConfigItem(
		position = 12,
		keyName = "verzikGreenBall",
		name = "Verzik Green Ball Tank",
		description = "Displays who the green ball is targeting",
		titleSection = "verzikSection"
	)
	default boolean verzikGreenBall()
	{
		return true;
	}

	@ConfigItem(
		position = 13,
		keyName = "verzikTornado",
		name = "Verzik Personal Tornado Highlight",
		description = "Displays the tornado that is targeting you",
		titleSection = "verzikSection"
	)
	default boolean verzikTornado()
	{
		return true;
	}

	/* Nylocas Highlighting Configuration Selectors */
	@ConfigItem(
		keyName = "highlightMelee",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightMeleeNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightMelee",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightMeleeNylo(boolean set);

	@ConfigItem(
		keyName = "highlightMage",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightMageNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightMage",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightMageNylo(boolean set);

	@ConfigItem(
		keyName = "highlightRange",
		name = "",
		description = "",
		hidden = true
	)
	default boolean getHighlightRangeNylo()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightRange",
		name = "",
		description = "",
		hidden = true
	)
	void setHighlightRangeNylo(boolean set);
}
