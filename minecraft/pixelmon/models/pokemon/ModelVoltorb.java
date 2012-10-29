// Date: 7/31/2012 12:26:57 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.models.pokemon;

import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelVoltorb extends ModelBase {
	// fields
	ModelRenderer VoltorbBase;

	public ModelVoltorb() {
		textureWidth = 300;
		textureHeight = 302;

		VoltorbBase = new ModelRenderer(this, "VoltorbBase");
		VoltorbBase.setRotationPoint(0F, 0F, 0F);
		setRotation(VoltorbBase, 0F, 0F, 0F);
		VoltorbBase.mirror = true;
		ModelRenderer Shape1 = new ModelRenderer(this, 0, 274);
		Shape1.addBox(-2F, 4F, -3F, 4, 20, 6);
		Shape1.setRotationPoint(0F, 0F, 0F);
		Shape1.setTextureSize(300, 302);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		ModelRenderer Shape2 = new ModelRenderer(this, 21, 274);
		Shape2.addBox(-3F, 4F, -2F, 6, 20, 4);
		Shape2.setRotationPoint(0F, 0F, 0F);
		Shape2.setTextureSize(300, 302);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		ModelRenderer Shape3 = new ModelRenderer(this, 42, 274);
		Shape3.addBox(-3F, 5F, -5F, 6, 18, 10);
		Shape3.setRotationPoint(0F, 0F, 0F);
		Shape3.setTextureSize(300, 302);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		ModelRenderer Shape4 = new ModelRenderer(this, 75, 274);
		Shape4.addBox(-3F, 5F, -5F, 6, 18, 10);
		Shape4.setRotationPoint(0F, 0F, 0F);
		Shape4.setTextureSize(300, 302);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 1.570796F, 0F);
		ModelRenderer Shape5 = new ModelRenderer(this, 108, 274);
		Shape5.addBox(-4F, 5F, -4F, 8, 18, 8);
		Shape5.setRotationPoint(0F, 0F, 0F);
		Shape5.setTextureSize(300, 302);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		ModelRenderer Shape6 = new ModelRenderer(this, 141, 274);
		Shape6.addBox(-4F, 6F, -6F, 8, 16, 12);
		Shape6.setRotationPoint(0F, 0F, 0F);
		Shape6.setTextureSize(300, 302);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		ModelRenderer Shape7 = new ModelRenderer(this, 182, 274);
		Shape7.addBox(-4F, 6F, -6F, 8, 16, 12);
		Shape7.setRotationPoint(0F, 0F, 0F);
		Shape7.setTextureSize(300, 302);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 1.570796F, 0F);
		ModelRenderer Shape8 = new ModelRenderer(this, 223, 274);
		Shape8.addBox(-5F, 21F, -5F, 10, 1, 10);
		Shape8.setRotationPoint(0F, 0F, 0F);
		Shape8.setTextureSize(300, 302);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		ModelRenderer Shape9 = new ModelRenderer(this, 264, 270);
		Shape9.addBox(-1F, 6F, -7F, 2, 16, 14);
		Shape9.setRotationPoint(0F, 0F, 0F);
		Shape9.setTextureSize(300, 302);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		ModelRenderer Shape42 = new ModelRenderer(this, 0, 240);
		Shape42.addBox(-1F, 6F, -7F, 2, 16, 14);
		Shape42.setRotationPoint(0F, 0F, 0F);
		Shape42.setTextureSize(300, 302);
		Shape42.mirror = true;
		setRotation(Shape42, 0F, 1.570796F, 0F);
		ModelRenderer Shape10 = new ModelRenderer(this, 33, 240);
		Shape10.addBox(-7F, 7F, -4F, 14, 14, 8);
		Shape10.setRotationPoint(0F, 0F, 0F);
		Shape10.setTextureSize(300, 302);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		ModelRenderer Shape11 = new ModelRenderer(this, 78, 240);
		Shape11.addBox(-4F, 7F, -7F, 8, 13, 14);
		Shape11.setRotationPoint(0F, 0F, 0F);
		Shape11.setTextureSize(300, 302);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		ModelRenderer Shape12 = new ModelRenderer(this, 123, 240);
		Shape12.addBox(-6F, 7F, -5F, 12, 14, 10);
		Shape12.setRotationPoint(0F, 0F, 0F);
		Shape12.setTextureSize(300, 302);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		ModelRenderer Shape13 = new ModelRenderer(this, 168, 240);
		Shape13.addBox(-5F, 7F, -6F, 10, 14, 12);
		Shape13.setRotationPoint(0F, 0F, 0F);
		Shape13.setTextureSize(300, 302);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		ModelRenderer Shape14 = new ModelRenderer(this, 213, 240);
		Shape14.addBox(-1F, 7F, -8F, 2, 14, 16);
		Shape14.setRotationPoint(0F, 0F, 0F);
		Shape14.setTextureSize(300, 302);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		ModelRenderer Shape15 = new ModelRenderer(this, 250, 240);
		Shape15.addBox(-8F, 7F, -1F, 16, 14, 2);
		Shape15.setRotationPoint(0F, 0F, 0F);
		Shape15.setTextureSize(300, 302);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		ModelRenderer Shape16 = new ModelRenderer(this, 0, 210);
		Shape16.addBox(-4F, 8F, -8F, 8, 12, 16);
		Shape16.setRotationPoint(0F, 0F, 0F);
		Shape16.setTextureSize(300, 302);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		ModelRenderer Shape17 = new ModelRenderer(this, 49, 210);
		Shape17.addBox(-8F, 8F, -4F, 16, 12, 8);
		Shape17.setRotationPoint(0F, 0F, 0F);
		Shape17.setTextureSize(300, 302);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		ModelRenderer Shape18 = new ModelRenderer(this, 98, 210);
		Shape18.addBox(-7F, 7F, -4F, 14, 14, 8);
		Shape18.setRotationPoint(0F, 0F, 0F);
		Shape18.setTextureSize(300, 302);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 1.570796F, 0F);
		ModelRenderer Shape19 = new ModelRenderer(this, 143, 210);
		Shape19.addBox(-6F, 8F, -6F, 12, 12, 12);
		Shape19.setRotationPoint(0F, 0F, 0F);
		Shape19.setTextureSize(300, 302);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		ModelRenderer Shape20 = new ModelRenderer(this, 192, 210);
		Shape20.addBox(-5F, 8F, -7F, 10, 12, 14);
		Shape20.setRotationPoint(0F, 0F, 0F);
		Shape20.setTextureSize(300, 302);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 1.570796F, 0F);
		ModelRenderer Shape21 = new ModelRenderer(this, 241, 210);
		Shape21.addBox(-3F, 9F, -9F, 6, 10, 18);
		Shape21.setRotationPoint(0F, 0F, 0F);
		Shape21.setTextureSize(300, 302);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		ModelRenderer Shape22 = new ModelRenderer(this, 0, 180);
		Shape22.addBox(-3F, 9F, -9F, 6, 10, 18);
		Shape22.setRotationPoint(0F, 0F, 0F);
		Shape22.setTextureSize(300, 302);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 1.570796F, 0F);
		ModelRenderer Shape23 = new ModelRenderer(this, 91, 39);
		Shape23.addBox(-5F, 10F, -8F, 10, 9, 16);
		Shape23.setRotationPoint(0F, 0F, 0F);
		Shape23.setTextureSize(300, 302);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		ModelRenderer Shape24 = new ModelRenderer(this, 102, 180);
		Shape24.addBox(-5F, 9F, -8F, 10, 10, 16);
		Shape24.setRotationPoint(0F, 0F, 0F);
		Shape24.setTextureSize(300, 302);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 1.570796F, 0F);
		ModelRenderer Shape25 = new ModelRenderer(this, 155, 180);
		Shape25.addBox(-6F, 9F, -7F, 12, 10, 14);
		Shape25.setRotationPoint(0F, 0F, 0F);
		Shape25.setTextureSize(300, 302);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		ModelRenderer Shape26 = new ModelRenderer(this, 208, 180);
		Shape26.addBox(-7F, 9F, -6F, 14, 10, 12);
		Shape26.setRotationPoint(0F, 0F, 0F);
		Shape26.setTextureSize(300, 302);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0F);
		ModelRenderer Shape27 = new ModelRenderer(this, 0, 150);
		Shape27.addBox(-9F, 10F, -4F, 18, 8, 8);
		Shape27.setRotationPoint(0F, 0F, 0F);
		Shape27.setTextureSize(300, 302);
		Shape27.mirror = true;
		setRotation(Shape27, 0F, 0F, 0F);
		ModelRenderer Shape28 = new ModelRenderer(this, 53, 150);
		Shape28.addBox(-4F, 10F, -9F, 8, 8, 18);
		Shape28.setRotationPoint(0F, 0F, 0F);
		Shape28.setTextureSize(300, 302);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0F);
		ModelRenderer Shape29 = new ModelRenderer(this, 106, 150);
		Shape29.addBox(-8F, 10F, -6F, 16, 8, 12);
		Shape29.setRotationPoint(0F, 0F, 0F);
		Shape29.setTextureSize(300, 302);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0F);
		ModelRenderer Shape30 = new ModelRenderer(this, 163, 151);
		Shape30.addBox(-6F, 11F, -8F, 12, 7, 16);
		Shape30.setRotationPoint(0F, 0F, 0F);
		Shape30.setTextureSize(300, 302);
		Shape30.mirror = true;
		setRotation(Shape30, 0F, 0F, 0F);
		ModelRenderer Shape31 = new ModelRenderer(this, 220, 150);
		Shape31.addBox(-7F, 11F, -7F, 14, 7, 14);
		Shape31.setRotationPoint(0F, 0F, 0F);
		Shape31.setTextureSize(300, 302);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, 0F);
		ModelRenderer Shape32 = new ModelRenderer(this, 0, 120);
		Shape32.addBox(-2F, 11F, -10F, 4, 6, 20);
		Shape32.setRotationPoint(0F, 0F, 0F);
		Shape32.setTextureSize(300, 302);
		Shape32.mirror = true;
		setRotation(Shape32, 0F, 0F, 0F);
		ModelRenderer Shape33 = new ModelRenderer(this, 49, 120);
		Shape33.addBox(-10F, 11F, -2F, 20, 6, 4);
		Shape33.setRotationPoint(0F, 0F, 0F);
		Shape33.setTextureSize(300, 302);
		Shape33.mirror = true;
		setRotation(Shape33, 0F, 0F, 0F);
		ModelRenderer Shape34 = new ModelRenderer(this, 98, 120);
		Shape34.addBox(-5F, 11F, -9F, 10, 6, 18);
		Shape34.setRotationPoint(0F, 0F, 0F);
		Shape34.setTextureSize(300, 302);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 0F);
		ModelRenderer Shape35 = new ModelRenderer(this, 155, 120);
		Shape35.addBox(-9F, 11F, -5F, 18, 6, 10);
		Shape35.setRotationPoint(0F, 0F, 0F);
		Shape35.setTextureSize(300, 302);
		Shape35.mirror = true;
		setRotation(Shape35, 0F, 0F, 0F);
		ModelRenderer Shape36 = new ModelRenderer(this, 212, 120);
		Shape36.addBox(-3F, 12F, -10F, 6, 4, 20);
		Shape36.setRotationPoint(0F, 0F, 0F);
		Shape36.setTextureSize(300, 302);
		Shape36.mirror = true;
		setRotation(Shape36, 0F, 0F, 0F);
		ModelRenderer Shape37 = new ModelRenderer(this, 0, 90);
		Shape37.addBox(-10F, 12F, -3F, 20, 4, 6);
		Shape37.setRotationPoint(0F, 0F, 0F);
		Shape37.setTextureSize(300, 302);
		Shape37.mirror = true;
		setRotation(Shape37, 0F, 0F, 0F);
		ModelRenderer Shape39 = new ModelRenderer(this, 114, 90);
		Shape39.addBox(-7F, 13F, -8F, 14, 2, 16);
		Shape39.setRotationPoint(0F, 0F, 0F);
		Shape39.setTextureSize(300, 302);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 0F, 0F);
		ModelRenderer Shape38 = new ModelRenderer(this, 53, 90);
		Shape38.addBox(-8F, 13F, -7F, 16, 2, 14);
		Shape38.setRotationPoint(0F, 0F, 0F);
		Shape38.setTextureSize(300, 302);
		Shape38.mirror = true;
		setRotation(Shape38, 0F, 0F, 0F);
		ModelRenderer Shape41 = new ModelRenderer(this, 175, 90);
		Shape41.addBox(-5F, 6F, -5F, 10, 16, 10);
		Shape41.setRotationPoint(0F, 0F, 0F);
		Shape41.setTextureSize(300, 302);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0F);
		ModelRenderer Shape40 = new ModelRenderer(this, 216, 90);
		Shape40.addBox(-5F, 8F, -7F, 10, 12, 14);
		Shape40.setRotationPoint(0F, 0F, 0F);
		Shape40.setTextureSize(300, 302);
		Shape40.mirror = true;
		setRotation(Shape40, 0F, 0F, 0F);
		ModelRenderer Shape45 = new ModelRenderer(this, 0, 41);
		Shape45.addBox(-6F, 10.1F, -6.8F, 5, 2, 1);
		Shape45.setRotationPoint(0F, 0F, 0F);
		Shape45.setTextureSize(300, 302);
		Shape45.mirror = true;
		setRotation(Shape45, 0F, -0.5925307F, -0.3717861F);
		ModelRenderer Shape43 = new ModelRenderer(this, 0, 53);
		Shape43.addBox(1.1F, 9F, -7.5F, 5, 1, 3);
		Shape43.setRotationPoint(0F, 0F, 0F);
		Shape43.setTextureSize(300, 302);
		Shape43.mirror = true;
		setRotation(Shape43, 0.0371755F, 0.5295853F, 0.4416032F);
		ModelRenderer Shape46 = new ModelRenderer(this, 0, 65);
		Shape46.addBox(0.3F, 9F, -7.49F, 1, 3, 3);
		Shape46.setRotationPoint(0F, 0F, 0F);
		Shape46.setTextureSize(300, 302);
		Shape46.mirror = true;
		setRotation(Shape46, 0.0261799F, 0.5630494F, 0.4234231F);
		ModelRenderer Shape44 = new ModelRenderer(this, 27, 40);
		Shape44.addBox(-6.1F, 9F, -7.5F, 5, 1, 3);
		Shape44.setRotationPoint(0F, 0F, 0F);
		Shape44.setTextureSize(300, 302);
		Shape44.mirror = true;
		setRotation(Shape44, 0.0371786F, -0.5295887F, -0.4415993F);
		ModelRenderer Shape47 = new ModelRenderer(this, 27, 53);
		Shape47.addBox(-1F, 8.8F, -7.65F, 1, 3, 4);
		Shape47.setRotationPoint(0F, 0F, 0F);
		Shape47.setTextureSize(300, 302);
		Shape47.mirror = true;
		setRotation(Shape47, 0.0546319F, -0.5424979F, -0.4044207F);
		ModelRenderer Shape48 = new ModelRenderer(this, 26, 65);
		Shape48.addBox(1F, 11.1F, -5.5F, 5, 2, 1);
		Shape48.setRotationPoint(0F, 0F, 0F);
		Shape48.setTextureSize(300, 302);
		Shape48.mirror = true;
		setRotation(Shape48, -0.1047198F, 0.610039F, 0.3937835F);

		VoltorbBase.addChild(Shape1);
		VoltorbBase.addChild(Shape2);
		VoltorbBase.addChild(Shape3);
		VoltorbBase.addChild(Shape4);
		VoltorbBase.addChild(Shape5);
		VoltorbBase.addChild(Shape6);
		VoltorbBase.addChild(Shape7);
		VoltorbBase.addChild(Shape8);
		VoltorbBase.addChild(Shape9);
		VoltorbBase.addChild(Shape10);
		VoltorbBase.addChild(Shape11);
		VoltorbBase.addChild(Shape12);
		VoltorbBase.addChild(Shape13);
		VoltorbBase.addChild(Shape14);
		VoltorbBase.addChild(Shape15);
		VoltorbBase.addChild(Shape16);
		VoltorbBase.addChild(Shape17);
		VoltorbBase.addChild(Shape18);
		VoltorbBase.addChild(Shape19);
		VoltorbBase.addChild(Shape20);
		VoltorbBase.addChild(Shape21);
		VoltorbBase.addChild(Shape22);
		VoltorbBase.addChild(Shape23);
		VoltorbBase.addChild(Shape24);
		VoltorbBase.addChild(Shape25);
		VoltorbBase.addChild(Shape26);
		VoltorbBase.addChild(Shape27);
		VoltorbBase.addChild(Shape28);
		VoltorbBase.addChild(Shape29);
		VoltorbBase.addChild(Shape30);
		VoltorbBase.addChild(Shape31);
		VoltorbBase.addChild(Shape32);
		VoltorbBase.addChild(Shape33);
		VoltorbBase.addChild(Shape34);
		VoltorbBase.addChild(Shape35);
		VoltorbBase.addChild(Shape36);
		VoltorbBase.addChild(Shape37);
		VoltorbBase.addChild(Shape38);
		VoltorbBase.addChild(Shape39);
		VoltorbBase.addChild(Shape40);
		VoltorbBase.addChild(Shape41);
		VoltorbBase.addChild(Shape42);
		VoltorbBase.addChild(Shape43);
		VoltorbBase.addChild(Shape44);
		VoltorbBase.addChild(Shape45);
		VoltorbBase.addChild(Shape46);
		VoltorbBase.addChild(Shape47);
		VoltorbBase.addChild(Shape48);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		VoltorbBase.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
