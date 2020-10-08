package com.san.multithreading;

//extending Thread
//Implementing Runnable


//Optimal Use of CPU

/*
 * 
Task1 Started
101 102 103 104 105 106 107 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 
Task2 Started
108 320 109 321 110 322 323 111 201 324 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 112 260 261 262 263 264 265 266 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 113 114 115 391 392 393 394 395 396 397 398 399 
Task3 Done
Main Done
116 117 118 119 120 121 122 123 124 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 
Task2 Done
125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 
Task1 Done
 * 
 * */

//NEW
//RUNNABLE
//RUNNING
//BLOCKED / WAITING -- External service to responde/ Waiting for Data from DB/ IO Opeation
//TERMINATED/DEAD


//Priority

//Communication Between Thread
//join();  Thread.sleep();  Thread.yeild(); I am getting a lot of cpu at this point i am ok to go into waiting state. 


//Synchronized... Concurrent Collection


//Executor Service:



class Task1 extends Thread {

	public void run() { // Singnature must match

		// Task1
		System.out.println("\nTask1 Started");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");

		
		//Thread.sleep(1000);
	
		//Thread.yield();
		
		System.out.println("\nTask1 Done"); //TERMINATED/DEAD
	}

}

class Task2 implements Runnable {

	public void run() {

		// Task2
		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");
		
		System.out.println("\nTask2 Done"); //TERMINATED/DEAD
	}

}

public class ThreadExample1 {

	public static void main(String args[]) throws InterruptedException {

		
		// Task1
		Task1 task1 = new Task1();  //NEW
		// task1.run(); // Wrong -- Calling like any normal method
		task1.setPriority(1);
		task1.start(); // Internal Thread behaviour applied

		task1.join();
		
		// Task2
		Task2 task2 = new Task2();
		Thread threadTask2 = new Thread(task2);
		//threadTask2.setPriority(10);
		threadTask2.start();

		//wait for task1 to complete
		//task1.join();
		//threadTask2.join();
		// Task3
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");
		System.out.println("\nTask3 Done");

		
		
		System.out.println("Main Done");
	}

}
