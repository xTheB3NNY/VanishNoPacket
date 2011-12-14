package to.joe.vanish.sniffers;

import net.minecraft.server.Packet42RemoveMobEffect;

import org.bukkit.entity.Player;
import org.getspout.spout.packet.standard.MCCraftPacket;
import org.getspout.spoutapi.packet.standard.MCPacket;

import to.joe.vanish.VanishManager;

public class Sniffer42RemoveMobEffect extends Sniffer {

    public Sniffer42RemoveMobEffect(VanishManager vanish) {
        super(net.minecraft.server.Packet42RemoveMobEffect.class, vanish);
    }

    @Override
    public boolean checkPacket2(Player player, MCPacket packet) {
        return !this.vanish.shouldHide(player, ((Packet42RemoveMobEffect) ((MCCraftPacket) packet).getPacket()).a);
    }

}
