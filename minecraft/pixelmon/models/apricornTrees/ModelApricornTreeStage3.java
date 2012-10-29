package pixelmon.models.apricornTrees;

import pixelmon.blocks.apricornTrees.TileEntityApricornTree;
import net.minecraft.src.Entity;
import net.minecraft.src.ModelBase;
import net.minecraft.src.ModelRenderer;

public class ModelApricornTreeStage3 extends ModelApricornTreeBase {
	// fields
	ModelRenderer Base;
	ModelRenderer RootFront;
	ModelRenderer RootBack;
	ModelRenderer RootRight;
	ModelRenderer RootLeft;
	ModelRenderer Bush1;
	ModelRenderer Bush2;
	ModelRenderer Bush3;
	ModelRenderer Bush4;
	ModelRenderer Bush5;
	ModelRenderer Bush6;
	ModelRenderer Bush7;
	ModelRenderer RightPetal1;
	ModelRenderer LeftPetal1;
	ModelRenderer BackPetal1;
	ModelRenderer FlowerMiddle;
	ModelRenderer FrontPetal1;
	ModelRenderer FrontPetal2;
	ModelRenderer LeftPetal2;
	ModelRenderer BackPetal2;
	ModelRenderer RightPetal2;
	ModelRenderer FlowerBud;

	public ModelApricornTreeStage3() {
		textureWidth = 256;
		textureHeight = 128;

		Base = new ModelRenderer(this, 65, 30);
		Base.addBox(-1.5F, 0F, -1.5F, 3, 6, 3);
		Base.setRotationPoint(0F, 18F, 0F);
		Base.setTextureSize(256, 128);
		Base.mirror = true;
		setRotation(Base, 0F, 0F, 0F);
		RootFront = new ModelRenderer(this, 64, 0);
		RootFront.addBox(-2F, 0F, -2F, 4, 2, 2);
		RootFront.setRotationPoint(0F, 23F, -2F);
		RootFront.setTextureSize(256, 128);
		RootFront.mirror = true;
		setRotation(RootFront, 0.5235988F, 0F, 0F);
		RootBack = new ModelRenderer(this, 64, 0);
		RootBack.addBox(-2F, 0F, 0F, 4, 2, 2);
		RootBack.setRotationPoint(0F, 23F, 2F);
		RootBack.setTextureSize(256, 128);
		RootBack.mirror = true;
		setRotation(RootBack, -0.5235988F, 0F, 0F);
		RootRight = new ModelRenderer(this, 64, 0);
		RootRight.addBox(-2F, 0F, -2F, 2, 2, 4);
		RootRight.setRotationPoint(-2F, 23F, 0F);
		RootRight.setTextureSize(256, 128);
		RootRight.mirror = true;
		setRotation(RootRight, 0F, 0F, -0.5235988F);
		RootLeft = new ModelRenderer(this, 64, 0);
		RootLeft.addBox(0F, 0F, -2F, 2, 2, 4);
		RootLeft.setRotationPoint(2F, 23F, 0F);
		RootLeft.setTextureSize(256, 128);
		RootLeft.mirror = true;
		setRotation(RootLeft, 0F, 0F, 0.5235988F);
		Bush1 = new ModelRenderer(this, 0, 0);
		Bush1.addBox(-3F, 0F, -3F, 6, 20, 6);
		Bush1.setRotationPoint(0F, -2F, 0F);
		Bush1.setTextureSize(256, 128);
		Bush1.mirror = true;
		setRotation(Bush1, 0F, 0F, 0F);
		Bush2 = new ModelRenderer(this, 0, 0);
		Bush2.addBox(-5.5F, 0F, -7F, 11, 13, 14);
		Bush2.setRotationPoint(0F, 1F, 0F);
		Bush2.setTextureSize(256, 128);
		Bush2.mirror = true;
		setRotation(Bush2, 0F, 0F, 0F);
		Bush3 = new ModelRenderer(this, 0, 0);
		Bush3.addBox(-3.5F, 0F, -3.5F, 7, 19, 7);
		Bush3.setRotationPoint(0F, -2F, 0F);
		Bush3.setTextureSize(256, 128);
		Bush3.mirror = true;
		setRotation(Bush3, 0F, 0F, 0F);
		Bush4 = new ModelRenderer(this, 0, 0);
		Bush4.addBox(-4.5F, 0F, -4.5F, 9, 18, 9);
		Bush4.setRotationPoint(0F, -1.5F, 0F);
		Bush4.setTextureSize(256, 128);
		Bush4.mirror = true;
		setRotation(Bush4, 0F, 0F, 0F);
		Bush5 = new ModelRenderer(this, 0, 0);
		Bush5.addBox(-5.5F, 0F, -5.5F, 11, 17, 11);
		Bush5.setRotationPoint(0F, -1F, 0F);
		Bush5.setTextureSize(256, 128);
		Bush5.mirror = true;
		setRotation(Bush5, 0F, 0F, 0F);
		Bush6 = new ModelRenderer(this, 0, 0);
		Bush6.addBox(-6.5F, 0F, -5.5F, 14, 13, 11);
		Bush6.setRotationPoint(-0.5F, 1F, 0F);
		Bush6.setTextureSize(256, 128);
		Bush6.mirror = true;
		setRotation(Bush6, 0F, 0F, 0F);
		Bush7 = new ModelRenderer(this, 0, 0);
		Bush7.addBox(-6.5F, 0F, -6.5F, 13, 15, 13);
		Bush7.setRotationPoint(0F, 0F, 0F);
		Bush7.setTextureSize(256, 128);
		Bush7.mirror = true;
		setRotation(Bush7, 0F, 0F, 0F);
		RightPetal1 = new ModelRenderer(this, 83, 0);
		RightPetal1.addBox(-4.5F, 0F, -1F, 2, 0, 2);
		RightPetal1.setRotationPoint(-1F, -1.9F, 0F);
		RightPetal1.setTextureSize(256, 128);
		RightPetal1.mirror = true;
		setRotation(RightPetal1, 0F, 0F, 0.3490659F);
		LeftPetal1 = new ModelRenderer(this, 83, 0);
		LeftPetal1.addBox(2.5F, 0F, -1F, 2, 0, 2);
		LeftPetal1.setRotationPoint(1F, -1.9F, 0F);
		LeftPetal1.setTextureSize(256, 128);
		LeftPetal1.mirror = true;
		setRotation(LeftPetal1, 0F, 0F, -0.3490659F);
		BackPetal1 = new ModelRenderer(this, 83, 0);
		BackPetal1.addBox(-1F, 0F, 2.5F, 2, 0, 2);
		BackPetal1.setRotationPoint(0F, -1.9F, 1F);
		BackPetal1.setTextureSize(256, 128);
		BackPetal1.mirror = true;
		setRotation(BackPetal1, 0.3490659F, 0F, 0F);
		FlowerMiddle = new ModelRenderer(this, 83, 0);
		FlowerMiddle.addBox(-1.5F, 0F, -1.5F, 3, 0, 3);
		FlowerMiddle.setRotationPoint(0F, -2.1F, 0F);
		FlowerMiddle.setTextureSize(256, 128);
		FlowerMiddle.mirror = true;
		setRotation(FlowerMiddle, 0F, 0F, 0F);
		FrontPetal1 = new ModelRenderer(this, 83, 0);
		FrontPetal1.addBox(-1F, 0F, -2F, 2, 0, 2);
		FrontPetal1.setRotationPoint(0F, -2.9F, -3F);
		FrontPetal1.setTextureSize(256, 128);
		FrontPetal1.mirror = true;
		setRotation(FrontPetal1, -0.3490659F, 0F, 0F);
		FrontPetal2 = new ModelRenderer(this, 79, 0);
		FrontPetal2.addBox(-2.5F, 0F, -3.5F, 5, 0, 3);
		FrontPetal2.setRotationPoint(0F, -1.9F, -1F);
		FrontPetal2.setTextureSize(256, 128);
		FrontPetal2.mirror = true;
		setRotation(FrontPetal2, -0.3490659F, 0F, 0F);
		LeftPetal2 = new ModelRenderer(this, 81, 0);
		LeftPetal2.addBox(0.5F, 0F, -2.5F, 3, 0, 5);
		LeftPetal2.setRotationPoint(1F, -1.9F, 0F);
		LeftPetal2.setTextureSize(256, 128);
		LeftPetal2.mirror = true;
		setRotation(LeftPetal2, 0F, 0F, -0.3490659F);
		BackPetal2 = new ModelRenderer(this, 79, 0);
		BackPetal2.addBox(-2.5F, 0F, 0.5F, 5, 0, 3);
		BackPetal2.setRotationPoint(0F, -1.9F, 1F);
		BackPetal2.setTextureSize(256, 128);
		BackPetal2.mirror = true;
		setRotation(BackPetal2, 0.3490659F, 0F, 0F);
		RightPetal2 = new ModelRenderer(this, 81, 0);
		RightPetal2.addBox(-3.5F, 0F, -2.5F, 3, 0, 5);
		RightPetal2.setRotationPoint(-1F, -1.9F, 0F);
		RightPetal2.setTextureSize(256, 128);
		RightPetal2.mirror = true;
		setRotation(RightPetal2, 0F, 0F, 0.3490659F);
		FlowerBud = new ModelRenderer(this, 0, 32);
		FlowerBud.addBox(-1F, 0F, -1F, 2, 1, 2);
		FlowerBud.setRotationPoint(0F, -2.5F, 0F);
		FlowerBud.setTextureSize(256, 128);
		FlowerBud.mirror = true;
		setRotation(FlowerBud, 0F, 0F, 0F);
	}

	public void renderModel(TileEntityApricornTree entity, float f5) {
		Base.render(f5);
		RootFront.render(f5);
		RootBack.render(f5);
		RootRight.render(f5);
		RootLeft.render(f5);
		Bush1.render(f5);
		Bush2.render(f5);
		Bush3.render(f5);
		Bush4.render(f5);
		Bush5.render(f5);
		Bush6.render(f5);
		Bush7.render(f5);
		RightPetal1.render(f5);
		LeftPetal1.render(f5);
		BackPetal1.render(f5);
		FlowerMiddle.render(f5);
		FrontPetal1.render(f5);
		FrontPetal2.render(f5);
		LeftPetal2.render(f5);
		BackPetal2.render(f5);
		RightPetal2.render(f5);
		FlowerBud.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
