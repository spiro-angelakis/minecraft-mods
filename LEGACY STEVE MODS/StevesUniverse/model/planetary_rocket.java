// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class planetary_rocket extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer barrels;
	private final ModelRenderer barrel1;
	private final ModelRenderer octagon_r1;
	private final ModelRenderer barrel2;
	private final ModelRenderer octagon_r2;
	private final ModelRenderer barrel3;
	private final ModelRenderer octagon_r3;
	private final ModelRenderer barrel4;
	private final ModelRenderer octagon_r4;
	private final ModelRenderer barrel5;
	private final ModelRenderer octagon_r5;
	private final ModelRenderer barrel_lip1;
	private final ModelRenderer barrel_lip2;
	private final ModelRenderer barrel_lip3;
	private final ModelRenderer barrel_lip4;
	private final ModelRenderer barrel_lip5;
	private final ModelRenderer barrel_lip6;
	private final ModelRenderer barrel_lip7;
	private final ModelRenderer barrel_lip8;
	private final ModelRenderer barrels3;
	private final ModelRenderer barrel11;
	private final ModelRenderer octagon_r6;
	private final ModelRenderer barrel12;
	private final ModelRenderer octagon_r7;
	private final ModelRenderer barrel13;
	private final ModelRenderer octagon_r8;
	private final ModelRenderer barrel14;
	private final ModelRenderer octagon_r9;
	private final ModelRenderer barrel15;
	private final ModelRenderer octagon_r10;
	private final ModelRenderer barrel_lip17;
	private final ModelRenderer barrel_lip18;
	private final ModelRenderer barrel_lip19;
	private final ModelRenderer barrel_lip20;
	private final ModelRenderer barrel_lip21;
	private final ModelRenderer barrel_lip22;
	private final ModelRenderer barrel_lip23;
	private final ModelRenderer barrel_lip24;
	private final ModelRenderer barrels2;
	private final ModelRenderer barrel6;
	private final ModelRenderer octagon_r11;
	private final ModelRenderer barrel7;
	private final ModelRenderer octagon_r12;
	private final ModelRenderer barrel8;
	private final ModelRenderer octagon_r13;
	private final ModelRenderer barrel9;
	private final ModelRenderer octagon_r14;
	private final ModelRenderer barrel10;
	private final ModelRenderer octagon_r15;
	private final ModelRenderer barrel_lip9;
	private final ModelRenderer barrel_lip10;
	private final ModelRenderer barrel_lip11;
	private final ModelRenderer barrel_lip12;
	private final ModelRenderer barrel_lip13;
	private final ModelRenderer barrel_lip14;
	private final ModelRenderer barrel_lip15;
	private final ModelRenderer barrel_lip16;
	private final ModelRenderer tubes;
	private final ModelRenderer tube1;
	private final ModelRenderer octagon_r16;
	private final ModelRenderer tube2;
	private final ModelRenderer octagon_r17;
	private final ModelRenderer tube3;
	private final ModelRenderer octagon_r18;
	private final ModelRenderer tube4;
	private final ModelRenderer octagon_r19;
	private final ModelRenderer fuel_tanks;
	private final ModelRenderer fuel_tank1;
	private final ModelRenderer octagon_r20;
	private final ModelRenderer fuel_tank2;
	private final ModelRenderer octagon_r21;

	public planetary_rocket() {
		textureWidth = 512;
		textureHeight = 512;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 18.0F, 0.0F);
		

		barrels = new ModelRenderer(this);
		barrels.setRotationPoint(-66.0F, -3.0F, 0.0F);
		all.addChild(barrels);
		

		barrel1 = new ModelRenderer(this);
		barrel1.setRotationPoint(0.0F, -23.0F, 0.0F);
		barrels.addChild(barrel1);
		barrel1.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);
		barrel1.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);

		octagon_r1 = new ModelRenderer(this);
		octagon_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel1.addChild(octagon_r1);
		setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
		octagon_r1.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);
		octagon_r1.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(0.0F, -18.0F, 0.0F);
		barrels.addChild(barrel2);
		barrel2.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);
		barrel2.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);

		octagon_r2 = new ModelRenderer(this);
		octagon_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel2.addChild(octagon_r2);
		setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
		octagon_r2.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);
		octagon_r2.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(0.0F, -11.0F, 0.0F);
		barrels.addChild(barrel3);
		barrel3.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);
		barrel3.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);

		octagon_r3 = new ModelRenderer(this);
		octagon_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(octagon_r3);
		setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
		octagon_r3.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);
		octagon_r3.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(0.0F, -5.0F, 0.0F);
		barrels.addChild(barrel4);
		barrel4.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);
		barrel4.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);

		octagon_r4 = new ModelRenderer(this);
		octagon_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel4.addChild(octagon_r4);
		setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
		octagon_r4.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);
		octagon_r4.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);

		barrel5 = new ModelRenderer(this);
		barrel5.setRotationPoint(0.0F, -1.0F, 0.0F);
		barrels.addChild(barrel5);
		barrel5.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);
		barrel5.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);

		octagon_r5 = new ModelRenderer(this);
		octagon_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel5.addChild(octagon_r5);
		setRotationAngle(octagon_r5, 0.0F, -0.7854F, 0.0F);
		octagon_r5.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);
		octagon_r5.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);

		barrel_lip1 = new ModelRenderer(this);
		barrel_lip1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip1);
		barrel_lip1.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip2 = new ModelRenderer(this);
		barrel_lip2.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip2);
		setRotationAngle(barrel_lip2, 0.0F, -0.7854F, 0.0F);
		barrel_lip2.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip3 = new ModelRenderer(this);
		barrel_lip3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip3);
		setRotationAngle(barrel_lip3, 0.0F, -1.5708F, 0.0F);
		barrel_lip3.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip4 = new ModelRenderer(this);
		barrel_lip4.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip4);
		setRotationAngle(barrel_lip4, -3.1416F, -0.7854F, 3.1416F);
		barrel_lip4.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip5 = new ModelRenderer(this);
		barrel_lip5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip5);
		setRotationAngle(barrel_lip5, -3.1416F, 0.0F, 3.1416F);
		barrel_lip5.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip6 = new ModelRenderer(this);
		barrel_lip6.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip6);
		setRotationAngle(barrel_lip6, -3.1416F, 0.7854F, 3.1416F);
		barrel_lip6.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip7 = new ModelRenderer(this);
		barrel_lip7.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip7);
		setRotationAngle(barrel_lip7, 0.0F, 1.5708F, 0.0F);
		barrel_lip7.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip8 = new ModelRenderer(this);
		barrel_lip8.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels.addChild(barrel_lip8);
		setRotationAngle(barrel_lip8, 0.0F, 0.7854F, 0.0F);
		barrel_lip8.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrels3 = new ModelRenderer(this);
		barrels3.setRotationPoint(69.0F, -3.0F, 0.0F);
		all.addChild(barrels3);
		

		barrel11 = new ModelRenderer(this);
		barrel11.setRotationPoint(0.0F, -23.0F, 0.0F);
		barrels3.addChild(barrel11);
		barrel11.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);
		barrel11.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);

		octagon_r6 = new ModelRenderer(this);
		octagon_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel11.addChild(octagon_r6);
		setRotationAngle(octagon_r6, 0.0F, -0.7854F, 0.0F);
		octagon_r6.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);
		octagon_r6.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);

		barrel12 = new ModelRenderer(this);
		barrel12.setRotationPoint(0.0F, -18.0F, 0.0F);
		barrels3.addChild(barrel12);
		barrel12.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);
		barrel12.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);

		octagon_r7 = new ModelRenderer(this);
		octagon_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel12.addChild(octagon_r7);
		setRotationAngle(octagon_r7, 0.0F, -0.7854F, 0.0F);
		octagon_r7.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);
		octagon_r7.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);

		barrel13 = new ModelRenderer(this);
		barrel13.setRotationPoint(0.0F, -11.0F, 0.0F);
		barrels3.addChild(barrel13);
		barrel13.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);
		barrel13.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);

		octagon_r8 = new ModelRenderer(this);
		octagon_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel13.addChild(octagon_r8);
		setRotationAngle(octagon_r8, 0.0F, -0.7854F, 0.0F);
		octagon_r8.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);
		octagon_r8.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);

		barrel14 = new ModelRenderer(this);
		barrel14.setRotationPoint(0.0F, -5.0F, 0.0F);
		barrels3.addChild(barrel14);
		barrel14.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);
		barrel14.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);

		octagon_r9 = new ModelRenderer(this);
		octagon_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel14.addChild(octagon_r9);
		setRotationAngle(octagon_r9, 0.0F, -0.7854F, 0.0F);
		octagon_r9.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);
		octagon_r9.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);

		barrel15 = new ModelRenderer(this);
		barrel15.setRotationPoint(0.0F, -1.0F, 0.0F);
		barrels3.addChild(barrel15);
		barrel15.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);
		barrel15.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);

		octagon_r10 = new ModelRenderer(this);
		octagon_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel15.addChild(octagon_r10);
		setRotationAngle(octagon_r10, 0.0F, -0.7854F, 0.0F);
		octagon_r10.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);
		octagon_r10.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);

		barrel_lip17 = new ModelRenderer(this);
		barrel_lip17.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip17);
		barrel_lip17.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip18 = new ModelRenderer(this);
		barrel_lip18.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip18);
		setRotationAngle(barrel_lip18, 0.0F, -0.7854F, 0.0F);
		barrel_lip18.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip19 = new ModelRenderer(this);
		barrel_lip19.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip19);
		setRotationAngle(barrel_lip19, 0.0F, -1.5708F, 0.0F);
		barrel_lip19.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip20 = new ModelRenderer(this);
		barrel_lip20.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip20);
		setRotationAngle(barrel_lip20, -3.1416F, -0.7854F, 3.1416F);
		barrel_lip20.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip21 = new ModelRenderer(this);
		barrel_lip21.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip21);
		setRotationAngle(barrel_lip21, -3.1416F, 0.0F, 3.1416F);
		barrel_lip21.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip22 = new ModelRenderer(this);
		barrel_lip22.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip22);
		setRotationAngle(barrel_lip22, -3.1416F, 0.7854F, 3.1416F);
		barrel_lip22.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip23 = new ModelRenderer(this);
		barrel_lip23.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip23);
		setRotationAngle(barrel_lip23, 0.0F, 1.5708F, 0.0F);
		barrel_lip23.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip24 = new ModelRenderer(this);
		barrel_lip24.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels3.addChild(barrel_lip24);
		setRotationAngle(barrel_lip24, 0.0F, 0.7854F, 0.0F);
		barrel_lip24.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrels2 = new ModelRenderer(this);
		barrels2.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(barrels2);
		

		barrel6 = new ModelRenderer(this);
		barrel6.setRotationPoint(0.0F, -23.0F, 0.0F);
		barrels2.addChild(barrel6);
		barrel6.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);
		barrel6.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);

		octagon_r11 = new ModelRenderer(this);
		octagon_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel6.addChild(octagon_r11);
		setRotationAngle(octagon_r11, 0.0F, -0.7854F, 0.0F);
		octagon_r11.setTextureOffset(310, 436).addBox(-16.0F, -2.0F, -6.6274F, 32.0F, 4.0F, 13.0F, 0.0F, false);
		octagon_r11.setTextureOffset(310, 436).addBox(-6.6274F, -2.0F, -16.0F, 13.0F, 4.0F, 32.0F, 0.0F, false);

		barrel7 = new ModelRenderer(this);
		barrel7.setRotationPoint(0.0F, -18.0F, 0.0F);
		barrels2.addChild(barrel7);
		barrel7.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);
		barrel7.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);

		octagon_r12 = new ModelRenderer(this);
		octagon_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel7.addChild(octagon_r12);
		setRotationAngle(octagon_r12, 0.0F, -0.7854F, 0.0F);
		octagon_r12.setTextureOffset(310, 436).addBox(-24.0F, -3.0F, -9.9411F, 48.0F, 6.0F, 19.0F, 0.0F, false);
		octagon_r12.setTextureOffset(310, 436).addBox(-9.9411F, -3.0F, -24.0F, 19.0F, 6.0F, 48.0F, 0.0F, false);

		barrel8 = new ModelRenderer(this);
		barrel8.setRotationPoint(0.0F, -11.0F, 0.0F);
		barrels2.addChild(barrel8);
		barrel8.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);
		barrel8.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);

		octagon_r13 = new ModelRenderer(this);
		octagon_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel8.addChild(octagon_r13);
		setRotationAngle(octagon_r13, 0.0F, -0.7854F, 0.0F);
		octagon_r13.setTextureOffset(310, 436).addBox(-28.0F, -4.0F, -11.598F, 56.0F, 8.0F, 23.0F, 0.0F, false);
		octagon_r13.setTextureOffset(310, 436).addBox(-11.598F, -4.0F, -28.0F, 23.0F, 8.0F, 56.0F, 0.0F, false);

		barrel9 = new ModelRenderer(this);
		barrel9.setRotationPoint(0.0F, -5.0F, 0.0F);
		barrels2.addChild(barrel9);
		barrel9.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);
		barrel9.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);

		octagon_r14 = new ModelRenderer(this);
		octagon_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel9.addChild(octagon_r14);
		setRotationAngle(octagon_r14, 0.0F, -0.7854F, 0.0F);
		octagon_r14.setTextureOffset(310, 436).addBox(-32.0F, -2.0F, -13.2548F, 64.0F, 4.0F, 26.0F, 0.0F, false);
		octagon_r14.setTextureOffset(310, 436).addBox(-13.2548F, -2.0F, -32.0F, 26.0F, 4.0F, 64.0F, 0.0F, false);

		barrel10 = new ModelRenderer(this);
		barrel10.setRotationPoint(0.0F, -1.0F, 0.0F);
		barrels2.addChild(barrel10);
		barrel10.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);
		barrel10.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);

		octagon_r15 = new ModelRenderer(this);
		octagon_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel10.addChild(octagon_r15);
		setRotationAngle(octagon_r15, 0.0F, -0.7854F, 0.0F);
		octagon_r15.setTextureOffset(310, 436).addBox(-36.0F, -2.0F, -14.9117F, 72.0F, 4.0F, 29.0F, 0.0F, false);
		octagon_r15.setTextureOffset(310, 436).addBox(-14.9117F, -2.0F, -36.0F, 29.0F, 4.0F, 72.0F, 0.0F, false);

		barrel_lip9 = new ModelRenderer(this);
		barrel_lip9.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip9);
		barrel_lip9.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip10 = new ModelRenderer(this);
		barrel_lip10.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip10);
		setRotationAngle(barrel_lip10, 0.0F, -0.7854F, 0.0F);
		barrel_lip10.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip11 = new ModelRenderer(this);
		barrel_lip11.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip11);
		setRotationAngle(barrel_lip11, 0.0F, -1.5708F, 0.0F);
		barrel_lip11.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip12 = new ModelRenderer(this);
		barrel_lip12.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip12);
		setRotationAngle(barrel_lip12, -3.1416F, -0.7854F, 3.1416F);
		barrel_lip12.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip13 = new ModelRenderer(this);
		barrel_lip13.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip13);
		setRotationAngle(barrel_lip13, -3.1416F, 0.0F, 3.1416F);
		barrel_lip13.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip14 = new ModelRenderer(this);
		barrel_lip14.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip14);
		setRotationAngle(barrel_lip14, -3.1416F, 0.7854F, 3.1416F);
		barrel_lip14.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip15 = new ModelRenderer(this);
		barrel_lip15.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip15);
		setRotationAngle(barrel_lip15, 0.0F, 1.5708F, 0.0F);
		barrel_lip15.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		barrel_lip16 = new ModelRenderer(this);
		barrel_lip16.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrels2.addChild(barrel_lip16);
		setRotationAngle(barrel_lip16, 0.0F, 0.7854F, 0.0F);
		barrel_lip16.setTextureOffset(310, 436).addBox(-15.0F, 1.0F, 33.0F, 30.0F, 3.0F, 3.0F, 0.0F, false);

		tubes = new ModelRenderer(this);
		tubes.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(tubes);
		

		tube1 = new ModelRenderer(this);
		tube1.setRotationPoint(0.0F, -105.0F, 0.0F);
		tubes.addChild(tube1);
		tube1.setTextureOffset(332, 177).addBox(-13.2548F, -80.0F, -32.0F, 26.0F, 160.0F, 64.0F, 0.0F, false);
		tube1.setTextureOffset(332, 177).addBox(-32.0F, -80.0F, -13.2548F, 64.0F, 160.0F, 26.0F, 0.0F, false);

		octagon_r16 = new ModelRenderer(this);
		octagon_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube1.addChild(octagon_r16);
		setRotationAngle(octagon_r16, 0.0F, -0.7854F, 0.0F);
		octagon_r16.setTextureOffset(332, 177).addBox(-32.0F, -80.0F, -13.2548F, 64.0F, 160.0F, 26.0F, 0.0F, false);
		octagon_r16.setTextureOffset(332, 177).addBox(-13.2548F, -80.0F, -32.0F, 26.0F, 160.0F, 64.0F, 0.0F, false);

		tube2 = new ModelRenderer(this);
		tube2.setRotationPoint(0.0F, -244.0F, 0.0F);
		tubes.addChild(tube2);
		tube2.setTextureOffset(354, 148).addBox(-11.598F, -60.0F, -28.0F, 23.0F, 120.0F, 56.0F, 0.0F, false);
		tube2.setTextureOffset(354, 148).addBox(-28.0F, -60.0F, -11.598F, 56.0F, 120.0F, 23.0F, 0.0F, false);

		octagon_r17 = new ModelRenderer(this);
		octagon_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube2.addChild(octagon_r17);
		setRotationAngle(octagon_r17, 0.0F, -0.7854F, 0.0F);
		octagon_r17.setTextureOffset(354, 148).addBox(-28.0F, -60.0F, -11.598F, 56.0F, 120.0F, 23.0F, 0.0F, false);
		octagon_r17.setTextureOffset(354, 148).addBox(-11.598F, -60.0F, -28.0F, 23.0F, 120.0F, 56.0F, 0.0F, false);

		tube3 = new ModelRenderer(this);
		tube3.setRotationPoint(0.0F, -336.0F, 0.0F);
		tubes.addChild(tube3);
		tube3.setTextureOffset(378, 69).addBox(-9.9411F, -32.0F, -24.0F, 19.0F, 64.0F, 48.0F, 0.0F, false);
		tube3.setTextureOffset(378, 69).addBox(-24.0F, -32.0F, -9.9411F, 48.0F, 64.0F, 19.0F, 0.0F, false);

		octagon_r18 = new ModelRenderer(this);
		octagon_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube3.addChild(octagon_r18);
		setRotationAngle(octagon_r18, 0.0F, -0.7854F, 0.0F);
		octagon_r18.setTextureOffset(378, 69).addBox(-24.0F, -32.0F, -9.9411F, 48.0F, 64.0F, 19.0F, 0.0F, false);
		octagon_r18.setTextureOffset(378, 69).addBox(-9.9411F, -32.0F, -24.0F, 19.0F, 64.0F, 48.0F, 0.0F, false);

		tube4 = new ModelRenderer(this);
		tube4.setRotationPoint(0.0F, -386.0F, 0.0F);
		tubes.addChild(tube4);
		tube4.setTextureOffset(412, 0).addBox(-7.4558F, -18.0F, -18.0F, 14.0F, 36.0F, 36.0F, 0.0F, false);
		tube4.setTextureOffset(412, 0).addBox(-18.0F, -18.0F, -7.4558F, 36.0F, 36.0F, 14.0F, 0.0F, false);

		octagon_r19 = new ModelRenderer(this);
		octagon_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		tube4.addChild(octagon_r19);
		setRotationAngle(octagon_r19, 0.0F, -0.7854F, 0.0F);
		octagon_r19.setTextureOffset(412, 0).addBox(-18.0F, -18.0F, -7.4558F, 36.0F, 36.0F, 14.0F, 0.0F, false);
		octagon_r19.setTextureOffset(412, 0).addBox(-7.4558F, -18.0F, -18.0F, 14.0F, 36.0F, 36.0F, 0.0F, false);

		fuel_tanks = new ModelRenderer(this);
		fuel_tanks.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(fuel_tanks);
		

		fuel_tank1 = new ModelRenderer(this);
		fuel_tank1.setRotationPoint(-65.0F, -151.0F, 0.0F);
		fuel_tanks.addChild(fuel_tank1);
		fuel_tank1.setTextureOffset(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.0F, 248.0F, 64.0F, 0.0F, false);
		fuel_tank1.setTextureOffset(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.0F, 0.0F, false);

		octagon_r20 = new ModelRenderer(this);
		octagon_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		fuel_tank1.addChild(octagon_r20);
		setRotationAngle(octagon_r20, 0.0F, -0.7854F, 0.0F);
		octagon_r20.setTextureOffset(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.0F, 0.0F, false);
		octagon_r20.setTextureOffset(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.0F, 248.0F, 64.0F, 0.0F, false);

		fuel_tank2 = new ModelRenderer(this);
		fuel_tank2.setRotationPoint(64.75F, -151.0F, 0.0F);
		fuel_tanks.addChild(fuel_tank2);
		fuel_tank2.setTextureOffset(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.0F, 248.0F, 64.0F, 0.0F, false);
		fuel_tank2.setTextureOffset(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.0F, 0.0F, false);

		octagon_r21 = new ModelRenderer(this);
		octagon_r21.setRotationPoint(0.0F, 0.0F, 0.0F);
		fuel_tank2.addChild(octagon_r21);
		setRotationAngle(octagon_r21, 0.0F, -0.7854F, 0.0F);
		octagon_r21.setTextureOffset(0, 0).addBox(-32.0F, -124.0F, -13.2548F, 64.0F, 248.0F, 26.0F, 0.0F, false);
		octagon_r21.setTextureOffset(0, 0).addBox(-13.2548F, -124.0F, -32.0F, 26.0F, 248.0F, 64.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		all.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}