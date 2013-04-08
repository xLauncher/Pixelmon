// Date: 2/12/2013 3:37:04 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.Bird.EnumWing;
import pixelmon.client.models.animations.Bird.ModuleWing;
import pixelmon.client.models.animations.Bird.SkeletonBird;

public class ModelArchen extends PixelmonModelBase {
	// fields
	PixelmonModelRenderer Body;

	public ModelArchen() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(-0.5F, 16, 2);
		PixelmonModelRenderer body = new PixelmonModelRenderer(this, 44, 0);
		body.addBox(-2F, -3F, -4F, 5, 5, 5);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, -0.2443461F, 0F, 0F);
		Body.addChild(body);
		PixelmonModelRenderer tail_base = new PixelmonModelRenderer(this, 29, 10);
		tail_base.addBox(-3F, -0.1333333F, -1F, 6, 0, 7);
		tail_base.setRotationPoint(0.5F, -3F, 1F);
		tail_base.setTextureSize(64, 32);
		tail_base.mirror = true;
		setRotation(tail_base, 0.9599311F, 0F, 0F);
		Body.addChild(tail_base);
		PixelmonModelRenderer tail_fethers = new PixelmonModelRenderer(this, 48, 10);
		tail_fethers.addBox(-2F, -4.133333F, -2F, 4, 4, 4);
		tail_fethers.setRotationPoint(0.5F, 1F, 2F);
		tail_fethers.setTextureSize(64, 32);
		tail_fethers.mirror = true;
		setRotation(tail_fethers, 0.5410521F, 0F, 0F);
		Body.addChild(tail_fethers);
		PixelmonModelRenderer tail_feathers_2 = new PixelmonModelRenderer(this, 40, 14);
		tail_feathers_2.addBox(-2.533333F, -0.1333333F, -1F, 0, 5, 5);
		tail_feathers_2.setRotationPoint(0.5F, -3F, 1F);
		tail_feathers_2.setTextureSize(64, 32);
		tail_feathers_2.mirror = true;
		setRotation(tail_feathers_2, 0.715585F, -0.3490659F, -0.3665191F);
		Body.addChild(tail_feathers_2);
		PixelmonModelRenderer tail_feathers_3 = new PixelmonModelRenderer(this, 40, 14);
		tail_feathers_3.addBox(2.466667F, -0.1333333F, -1F, 0, 5, 5);
		tail_feathers_3.setRotationPoint(0.5F, -3F, 1F);
		tail_feathers_3.setTextureSize(64, 32);
		tail_feathers_3.mirror = true;
		setRotation(tail_feathers_3, 0.715585F, 0.3490659F, 0.3665191F);
		Body.addChild(tail_feathers_3);
		PixelmonModelRenderer neck_feathers = new PixelmonModelRenderer(this, 18, 14);
		neck_feathers.addBox(-3F, 0.8F, -6.266667F, 6, 0, 3);
		neck_feathers.setRotationPoint(0.5F, 0F, -4F);
		neck_feathers.setTextureSize(64, 32);
		neck_feathers.mirror = true;
		setRotation(neck_feathers, -1.989675F, 0F, 0F);
		Body.addChild(neck_feathers);
		PixelmonModelRenderer neck_feathers_2 = new PixelmonModelRenderer(this, 0, -3);
		neck_feathers_2.addBox(0F, 0.8F, -3.666667F, 0, 4, 4);
		neck_feathers_2.setRotationPoint(0.5F, 0F, -4F);
		neck_feathers_2.setTextureSize(64, 32);
		neck_feathers_2.mirror = true;
		setRotation(neck_feathers_2, -2.164208F, 0.6457718F, -0.5410521F);
		Body.addChild(neck_feathers_2);
		PixelmonModelRenderer neck_feathers_3 = new PixelmonModelRenderer(this, 0, -3);
		neck_feathers_3.addBox(0F, 0.8F, -3.666667F, 0, 4, 4);
		neck_feathers_3.setRotationPoint(0.5F, 0F, -4F);
		neck_feathers_3.setTextureSize(64, 32);
		neck_feathers_3.mirror = true;
		setRotation(neck_feathers_3, -2.164208F, -0.6457718F, 0.5410521F);
		Body.addChild(neck_feathers_3);
		PixelmonModelRenderer neck_base = new PixelmonModelRenderer(this, 0, 17);
		neck_base.addBox(-2F, -3.733333F, -2F, 4, 4, 3);
		neck_base.setRotationPoint(0.5F, 0F, -4F);
		neck_base.setTextureSize(64, 32);
		neck_base.mirror = true;
		setRotation(neck_base, -0.7853982F, 0F, 0F);
		Body.addChild(neck_base);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0.5F, -5, -5);
		PixelmonModelRenderer head = new PixelmonModelRenderer(this, 21, 17);
		head.addBox(-2F, -2.733333F, -2.533333F, 4, 4, 4);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		Head.addChild(head);
		PixelmonModelRenderer neck = new PixelmonModelRenderer(this, 27, 26);
		neck.addBox(-1F, -1.733333F, -3.533333F, 2, 2, 3);
		neck.setRotationPoint(0F, 4F, 0F);
		neck.setTextureSize(64, 32);
		neck.mirror = true;
		setRotation(neck, -1.37881F, 0F, 0F);
		Head.addChild(neck);
		PixelmonModelRenderer top_beak = new PixelmonModelRenderer(this, 0, 24);
		top_beak.addBox(-2F, -2.666667F, -4.533333F, 3, 3, 5);
		top_beak.setRotationPoint(0.5F, 0F, -2F);
		top_beak.setTextureSize(64, 32);
		top_beak.mirror = true;
		setRotation(top_beak, 0.0872665F, 0F, 0F);
		Head.addChild(top_beak);
		PixelmonModelRenderer bottom_beak = new PixelmonModelRenderer(this, 16, 27);
		bottom_beak.addBox(-1F, -0.8F, -3.066667F, 2, 1, 4);
		bottom_beak.setRotationPoint(0F, 1F, -3F);
		bottom_beak.setTextureSize(64, 32);
		bottom_beak.mirror = true;
		setRotation(bottom_beak, 0.0872665F, 0F, 0F);
		Head.addChild(bottom_beak);
		Body.addChild(Head);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0.5F, 1, 2);
		PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 52, 18);
		tail_1.addBox(-1F, -3.133333F, 1.6F, 2, 2, 4);
		tail_1.setTextureSize(64, 32);
		tail_1.mirror = true;
		setRotation(tail_1, 0.8028515F, 0F, 0F);
		Tail.addChild(tail_1);
		PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 41, 18);
		tail_2.addBox(-0.5F, -3.133333F, 2F, 1, 1, 9);
		tail_2.setTextureSize(64, 32);
		tail_2.mirror = true;
		setRotation(tail_2, 0.7853982F, 0F, 0F);
		Tail.addChild(tail_2);
		PixelmonModelRenderer tail_tip = new PixelmonModelRenderer(this, 22, 0);
		tail_tip.addBox(-3.5F, -0.5333334F, 1F, 7, 0, 8);
		tail_tip.setRotationPoint(0F, -7F, 4F);
		tail_tip.setTextureSize(64, 32);
		tail_tip.mirror = true;
		setRotation(tail_tip, 0.7853982F, 0F, 0F);
		Tail.addChild(tail_tip);
		Body.addChild(Tail);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this, "LeftLeg");
		LeftLeg.setRotationPoint(1.5F, 1F, -1);
		PixelmonModelRenderer L_leg = new PixelmonModelRenderer(this, 37, 24);
		L_leg.addBox(0F, 0F, 0F, 1, 7, 1);
		L_leg.setTextureSize(64, 32);
		L_leg.mirror = true;
		setRotation(L_leg, -0.2268928F, 0F, -0.0698132F);
		LeftLeg.addChild(L_leg);
		PixelmonModelRenderer L_toe_1 = new PixelmonModelRenderer(this, 58, 29);
		L_toe_1.addBox(0F, 0F, -2F, 1, 1, 2);
		L_toe_1.setRotationPoint(1F, 6F, -1F);
		L_toe_1.setTextureSize(64, 32);
		L_toe_1.mirror = true;
		setRotation(L_toe_1, 0F, -0.715585F, 0F);
		LeftLeg.addChild(L_toe_1);
		PixelmonModelRenderer L_toe_2 = new PixelmonModelRenderer(this, 58, 29);
		L_toe_2.addBox(-0.4666667F, 0F, -2F, 1, 1, 2);
		L_toe_2.setRotationPoint(1F, 6F, -1F);
		L_toe_2.setTextureSize(64, 32);
		L_toe_2.mirror = true;
		setRotation(L_toe_2, 0F, -0.1047198F, 0F);
		LeftLeg.addChild(L_toe_2);
		PixelmonModelRenderer L_toe_3 = new PixelmonModelRenderer(this, 58, 29);
		L_toe_3.addBox(-1.266667F, 0F, -2F, 1, 1, 2);
		L_toe_3.setRotationPoint(1F, 6F, -1F);
		L_toe_3.setTextureSize(64, 32);
		L_toe_3.mirror = true;
		setRotation(L_toe_3, 0F, 0.2617994F, 0F);
		LeftLeg.addChild(L_toe_3);
		Body.addChild(LeftLeg);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this, "Right Leg");
		RightLeg.setRotationPoint(-0.5F, 1, -1);
		PixelmonModelRenderer R_leg = new PixelmonModelRenderer(this, 37, 24);
		R_leg.addBox(-1F, 0F, 0F, 1, 7, 1);
		R_leg.setTextureSize(64, 32);
		R_leg.mirror = true;
		setRotation(R_leg, -0.2268928F, 0F, 0.0698132F);
		RightLeg.addChild(R_leg);
		PixelmonModelRenderer R_toe_1 = new PixelmonModelRenderer(this, 58, 29);
		R_toe_1.addBox(-1F, 0F, -2F, 1, 1, 2);
		R_toe_1.setRotationPoint(-1F, 6F, -1F);
		R_toe_1.setTextureSize(64, 32);
		R_toe_1.mirror = true;
		setRotation(R_toe_1, 0F, 0.715585F, 0F);
		RightLeg.addChild(R_toe_1);
		PixelmonModelRenderer R_toe_2 = new PixelmonModelRenderer(this, 58, 29);
		R_toe_2.addBox(-0.4666667F, 0F, -2F, 1, 1, 2);
		R_toe_2.setRotationPoint(-1F, 6F, -1F);
		R_toe_2.setTextureSize(64, 32);
		R_toe_2.mirror = true;
		setRotation(R_toe_2, 0F, 0.1047198F, 0F);
		RightLeg.addChild(R_toe_2);
		PixelmonModelRenderer R_toe_3 = new PixelmonModelRenderer(this, 58, 29);
		R_toe_3.addBox(0.3333333F, 0F, -2F, 1, 1, 2);
		R_toe_3.setRotationPoint(-1F, 6F, -1F);
		R_toe_3.setTextureSize(64, 32);
		R_toe_3.mirror = true;
		setRotation(R_toe_3, 0F, -0.2617994F, 0F);
		RightLeg.addChild(R_toe_3);
		Body.addChild(RightLeg);

		PixelmonModelRenderer LeftWing = new PixelmonModelRenderer(this, "Left Wing");
		LeftWing.setRotationPoint(2.5F, -3F, -3);
		PixelmonModelRenderer L_wing = new PixelmonModelRenderer(this, 23, 0);
		L_wing.addBox(-0.8666667F, 0F, 0F, 1, 8, 2);
		L_wing.setTextureSize(64, 32);
		L_wing.mirror = true;
		setRotation(L_wing, -0.1396263F, 0.3316126F, -0.5235988F);
		LeftWing.addChild(L_wing);
		PixelmonModelRenderer L_wing_feathes = new PixelmonModelRenderer(this, 0, 0);
		L_wing_feathes.addBox(-0.5F, 2F, 1F, 0, 7, 8);
		L_wing_feathes.setTextureSize(64, 32);
		L_wing_feathes.mirror = true;
		setRotation(L_wing_feathes, 0F, 0.3316126F, -0.5235988F);
		LeftWing.addChild(L_wing_feathes);
		PixelmonModelRenderer L_wing_claw = new PixelmonModelRenderer(this, 51, 29);
		L_wing_claw.addBox(-0.2F, -1F, -2F, 1, 1, 2);
		L_wing_claw.setRotationPoint(3F, 7F, 0F);
		L_wing_claw.setTextureSize(64, 32);
		L_wing_claw.mirror = true;
		setRotation(L_wing_claw, 0.4363323F, 0.3316126F, -0.5235988F);
		LeftWing.addChild(L_wing_claw);
		Body.addChild(LeftWing);

		PixelmonModelRenderer RightWing = new PixelmonModelRenderer(this, "Right Wing");
		RightWing.setRotationPoint(-1.5F, -3, -3);
		PixelmonModelRenderer R_wing = new PixelmonModelRenderer(this, 23, 0);
		R_wing.addBox(0.1F, 0F, 0F, 1, 8, 2);
		R_wing.setTextureSize(64, 32);
		R_wing.mirror = true;
		setRotation(R_wing, -0.1396263F, -0.3316126F, 0.5235988F);
		RightWing.addChild(R_wing);
		PixelmonModelRenderer R_wing_feathes = new PixelmonModelRenderer(this, 0, 0);
		R_wing_feathes.addBox(0.5F, 2F, 1F, 0, 7, 8);
		R_wing_feathes.setTextureSize(64, 32);
		R_wing_feathes.mirror = true;
		setRotation(R_wing_feathes, 0F, -0.3316126F, 0.5235988F);
		RightWing.addChild(R_wing_feathes);
		PixelmonModelRenderer R_wing_claw = new PixelmonModelRenderer(this, 51, 29);
		R_wing_claw.addBox(-0.6F, -1F, -2F, 1, 1, 2);
		R_wing_claw.setRotationPoint(-3F, 7F, -1F);
		R_wing_claw.setTextureSize(64, 32);
		R_wing_claw.mirror = true;
		setRotation(R_wing_claw, 0.4363323F, -0.3316126F, 0.5235988F);
		RightWing.addChild(R_wing_claw);
		Body.addChild(RightWing);

		ModuleHead headModule = new ModuleHead(Head);
		
		ModuleWing rightWingModule = new ModuleWing(RightWing, EnumWing.Right, EnumWing.Verticle, 0.1F, 1.3F);
		ModuleWing leftWingModule = new ModuleWing(LeftWing,  EnumWing.Left, EnumWing.Verticle,  0.1F, 1.3F);
		
		skeleton = new SkeletonBird(Body, headModule, leftWingModule, rightWingModule, LeftLeg, RightLeg);

	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
