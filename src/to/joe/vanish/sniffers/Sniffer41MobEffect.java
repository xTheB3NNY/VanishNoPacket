package to.joe.vanish.sniffers;

import net.minecraft.server.Packet41MobEffect;

import org.bukkit.entity.Player;
import org.getspout.spout.packet.standard.MCCraftPacket;
import org.getspout.spoutapi.packet.standard.MCPacket;

import to.joe.vanish.VanishManager;

public class Sniffer41MobEffect extends Sniffer {

    public Sniffer41MobEffect(VanishManager vanish) {
        super(net.minecraft.server.Packet41MobEffect.class, vanish);
    }

    @Override
    public boolean checkPacket2(Player player, MCPacket packet) {
        return !this.vanish.shouldHide(player, ((Packet41MobEffect) ((MCCraftPacket) packet).getPacket()).a);
    }

}
